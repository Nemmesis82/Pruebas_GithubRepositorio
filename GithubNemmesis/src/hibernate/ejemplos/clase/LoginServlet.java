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
    public LoginServlet() {
       
    }

	//en la sesion guardamos el nombre
    //s1.setAtributte ("usuario",usuario)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//request.getSession();
		//response.sendRedirect("login.html");	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		final Logger log = LogManager.getRootLogger();

		ResultSet rset;       
		String user = request.getParameter("username");
		String pass = request.getParameter("pass");
	
		String us1 = null;
		String us2 = null;
		Connection newconex =null;
		PreparedStatement ps = null;
		Savepoint sp = null;	
	
		try {
				newconex = Conexion.obtenerConexion();
				newconex.setAutoCommit(false);
				sp= newconex.setSavepoint();
				ps = newconex.prepareStatement(InstruccionesSQL.buscarUsuario());
				ps.setString(1, user);
				ps.setString(2, pass);
				rset=ps.executeQuery();
				PrintWriter pw=response.getWriter();
				if (rset.next())
													
					{
						us1=rset.getString("USER_NAME");
						us2=rset.getString("USER_PASS");
						//System.out.println(user + pass);
						//System.out.println(us1 + us2);
						pw.print("El usuario es correcto");
						pw.print(" "+ user+ " "+ pass);
						response.sendRedirect("menu.html");
						request.getSession(true);
						
					}
					else
					{
						//System.out.println("No existe el usuario");
						pw.print("No existe el usuario");
						pw.print(user+ " "+ pass);
						response.sendRedirect("login.html");
					}
				response.setContentType("text/html");
						
				//pw.print(" "+ user + pass);
				//pw.print(us1 + us2);
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
