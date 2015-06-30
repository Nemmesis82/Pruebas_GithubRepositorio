package hibernate.ejemplos.clase;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("unused")
public class MedirTime extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
     

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		/***Medir tiempo de ejecución en el servlet de Isi****/
		
		/**
		 * Aqui declaro la variable con la que voy a capturar el tiempo antes de ejecutar el servlet 
		 */
		
		long isiInicio = System.currentTimeMillis();
				
		request.getRequestDispatcher("ContarElementosXMLServlet?url=http://www.w3schools.com/xml/note.xml").include(request, response);
		
		long isiFinal = System.currentTimeMillis();
		
		long isiTotal = isiFinal - isiInicio;
				
		PrintWriter pw=response.getWriter();
		
		
		/***Medir tiempo de ejecucion en el servlet de Jorge****/
		
		long jorgeInicio = System.currentTimeMillis();
				
		request.getRequestDispatcher("LeerXML?URL=http://www.w3schools.com/xml/note.xml").include(request, response);
		
		long jorgeFinal = System.currentTimeMillis();

		long jorgeTotal = jorgeFinal - jorgeInicio;
	
		PrintWriter pw2=response.getWriter();
				
		if (isiTotal>jorgeTotal)
		{	
			pw.println("<html>");
			pw.println("<title>Ruth Proyect</title>");
			pw.println("<b><center>");
			pw.println("<b><FONT FACE='impact' SIZE=10 COLOR='teal'>TIEMPO DE EJECUCION DEL SERVLET</FONT>");
			//pw.println("<head>TIEMPO DE EJECUCION DEL SERVLET </head>");
			pw.println("<body>");
			pw.println("<b><center>");
			pw.println("<b><BODY BACKGROUND='gris.jpg'>");
			pw.println("<hr><h1><FONT COLOR='blue'> Isidoro son: "+ isiTotal+ " "+ "milisegundos."+"<hr></FONT></h1>");
			pw.println("</hr>");
			pw.println("</html>");
			pw.println("</body>");
		
		}
		else if (isiTotal<jorgeTotal)
		{
			pw2.println("<html>");
			pw2.println("<title>Ruth Proyect</title>");
			pw2.println("<b><center>");
			pw2.println("<b><FONT FACE='impact' SIZE=10 COLOR='teal'>TIEMPO DE EJECUCION DEL SERVLET</FONT>");
			pw2.println("<body>");
			pw2.println("<b><center>");
			pw.println("<b><BODY BACKGROUND='gris.jpg'>");
			pw2.println("<hr><h1><FONT COLOR='purple'> Jorge son: "+ jorgeTotal+ " "+ "milisegundos."+ "<hr></FONT></h1>");
			pw2.println("<h2>");
			pw2.println("</hr>");
			pw2.println("</html>");
			pw2.println("</body>");
		}else
		{
			pw2.println("<html>");
			pw2.println("<title>Ruth Proyect</title>");
			pw2.println("<b><center>");
			pw2.println("<b><FONT FACE='impact' SIZE=10 COLOR='teal'>TIEMPOS DE EJECUCION DE ISIDORO Y JORGE</FONT>");
			pw2.println("<body>");
			pw2.println("<b><center>");
			pw.println("<b><BODY BACKGROUND='gris.jpg'>");
			pw2.println("<hr><h1><FONT COLOR='blue'> " + " Isidoro son: " + isiTotal+" "+ "milisegundos</h1>");
			pw2.println("<hr><h1><FONT COLOR='purple'> " + " Jorge son: " + jorgeTotal+ " "+ "milisegundos."+ "<hr></h1>");
			pw2.println("</hr>");
			pw2.println("</html>");
			pw2.println("</body>");
		}
			
	}
}
