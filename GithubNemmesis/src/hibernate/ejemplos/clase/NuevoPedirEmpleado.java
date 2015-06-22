package hibernate.ejemplos.clase;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;



import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class NuevoPedirEmpleado extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	String emp_id;
	
	String dat_Empl= null;
	
	int num;
 
    public NuevoPedirEmpleado() {
        super();
       
    }


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
				
		System.out.println("Estoy vivo");
			
		
		/**
		 * Aqui creo la variable de Empleado services para llamar al metodo empleado
		 */
		EmpleadoServices emp = new EmpleadoServices();

		/**
		 * Aqui creo una variable de empleado DAO para que haga la llamada al metodo
		 */
		
		EmpleadoHibernateDAO empH = new EmpleadoHibernateDAO();
		
		String emp_id = request.getParameter("ID_Empleado");
		
		emp.setIRecuperable(empH);
		
		int num =Integer.parseInt(emp_id);
		
		Employees e=(Employees) emp.leerEmpleado(num);
		response.setContentType("text/html");
		
		response.getWriter().write(e.toString());
		
		/***
		 * Hago una conexion con la clase de ServletcontextListener_Prueba
		 */
		
		ServletContext scl = request.getServletContext();
		
		SessionFactory sfac= (SessionFactory) scl.getAttribute("sf");
		
		Session sesi = sfac.openSession();
	
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
	}


	
}
