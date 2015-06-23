package hibernate.ejemplos.clase;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class NuevoPedirEmpleadoJDBC extends HttpServlet
{
		
		private final Logger log = LogManager.getRootLogger();
			
		String emp_id;
		
		String dat_Empl= null;
		
		int num;
	 
	    public NuevoPedirEmpleadoJDBC() {
	    }


		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			
				System.out.println("Estoy vivo Nuevo pedir EmpleadoJDBC");
				
				EmpleadoServices emp = new EmpleadoServices();
				
				//EmpleadoHibernateDAO empH = new EmpleadoHibernateDAO();
				EmpleadoDAO empD = new EmpleadoDAO();
				
				int num = 0;
				
				String emp_id = request.getParameter("ID_Empleado");
								
				num =Integer.parseInt(emp_id);
				
				try {
					empD.obtenerEmpleadoPorID(num);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
										
				//Employees e=(Employees) emp.leerEmpleado(num);
				
				EmpleadoDTO e=null;
				try {
					e = empD.obtenerEmpleadoPorID(num);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				response.setContentType("text/html");
				
				//response.getWriter().write(e.toString());
								
				ServletContext scl = request.getServletContext();
				
				SessionFactory sfac= (SessionFactory) scl.getAttribute("sf");
				
				Session sesi = sfac.openSession();
				
			} 

		
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			
		}
	
}
