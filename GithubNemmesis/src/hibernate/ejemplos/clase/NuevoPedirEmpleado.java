package hibernate.ejemplos.clase;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class NuevoPedirEmpleado extends HttpServlet
{
	
	private final Logger log = LogManager.getRootLogger();
		
	String emp_id;
	
	String dat_Empl= null;
	
	int num;
 
    public NuevoPedirEmpleado() {
    }


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
			System.out.println("Estoy vivo1");
			
			EmpleadoServices emp = new EmpleadoServices();
			
			EmpleadoHibernateDAO empH = new EmpleadoHibernateDAO();
			
			int num = 0;
			
			String emp_id = request.getParameter("ID_Empleado");
			
			emp.setIRecuperable(empH);
							
			num =Integer.parseInt(emp_id);
			
			Employees e=(Employees) emp.leerEmpleado(num);
			
			response.setContentType("text/html");
			
			response.getWriter().write(e.toString());
							
			ServletContext scl = request.getServletContext();
			
			SessionFactory sfac= (SessionFactory) scl.getAttribute("sf");
			
			Session sesi = sfac.openSession();
			
		} 

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}


	
}
