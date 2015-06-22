package hibernate.ejemplos.clase;

import java.awt.Component;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.cfg.Configuration;


public class PedirEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public PedirEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String emp_id = request.getParameter("ID_Empleado");
		
		String dat_Empl= null;
		
		int num =Integer.parseInt(emp_id);
		
		Connection conexion = Pool.getConnection();
		
		Statement st= null;
		
		ResultSet rs=null;
		
		try 
		{
	
			st= conexion.createStatement();
		
			rs= st.executeQuery("SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID= "+ emp_id);
			
			if (rs.next())
			{
				dat_Empl=rs.getString("First_name");
				dat_Empl=rs.getString("Last_name");
			}
			else
			{
				dat_Empl="No existe eemplleado con id";
			}
		
			response.setContentType("text/html");
			
			PrintWriter pw=response.getWriter();
			
			pw.print(dat_Empl);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
