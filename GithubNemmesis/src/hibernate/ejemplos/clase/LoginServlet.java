package hibernate.ejemplos.clase;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private final Logger log = LogManager.getRootLogger();

	private ResultSet rset;       
   
    public LoginServlet() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String user = request.getParameter("username");
		String pass = request.getParameter("pass");
	
		String us = null;
		Connection newconex =null;
		PreparedStatement ps = null;
		Savepoint sp = null;	
	
		try {
				newconex = Conexion.obtenerConexion();
				newconex.setAutoCommit(false);
				sp= newconex.setSavepoint();
				ps = newconex.prepareStatement(InstruccionesSQL.buscarUsuario());
				ps.setString(1, user);
				rset=ps.executeQuery();
				if (rset.next())
													
					{
						us=rset.getString("USER_NAME");
						us=rset.getString("USER_PASS");
						
						System.out.println(us);
					}
					else
					{
						us="No existe el usuario";
						System.out.println(us);
					}
				response.setContentType("text/html");
				
				PrintWriter pw=response.getWriter();
				
				pw.print(us);
			} 
		catch (Exception e) 
		{
			e.printStackTrace();
			}
		finally // libero los recursos
			{
				Conexion.LiberarRecursos(newconex,ps);
			}
	}
	
}
