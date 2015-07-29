package hibernate.ejemplos.clase;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletDepartamentos extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public ServletDepartamentos() 
    {
    
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("HOLAAA");
		
		
//		String dep_id = request.getParameter("ID_departament");
//		
//		String dat_dep= null;
//		
//		int num =Integer.parseInt(dep_id);
//		
//		System.out.println(num + "<-aki");
//		
//		Connection conexion = Pool.getConnection();
//		
//		Statement st= null;
//		
//		ResultSet rs=null;
//		
//		try 
//		{
//	
//			st= conexion.createStatement();
//		
//			rs= st.executeQuery("SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID= "+ dep_id);
//			
//			System.out.println(rs);
//			
//			if (rs.next())
//			{
//					dat_dep=rs.getString("DEPARTMENT_NAME");
//					System.out.println(dat_dep);
//			}
//				
//			else
//			{
//				dat_dep="No existe departamento con id";
//			}
//		
//			response.setContentType("text/html");
//			
//			PrintWriter pw=response.getWriter();
//			
//			pw.print(dat_dep);
//			System.out.println(dat_dep);
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
	}

}
