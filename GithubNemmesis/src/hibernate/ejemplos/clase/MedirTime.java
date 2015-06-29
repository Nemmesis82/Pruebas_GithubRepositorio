package hibernate.ejemplos.clase;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MedirTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MedirTime() {
       
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		/***Medir tiempo de ejecución en el servlet de Isi****/
		
		long isiInicio = System.currentTimeMillis();
		System.out.println("El tiempo del servlet Isi Inicial es: " + isiInicio);
		
		request.getRequestDispatcher("ContarElementosXMLServlet?url=http://www.w3schools.com/xml/note.xml").include(request, response);
		
		long isiFinal = System.currentTimeMillis();
		System.out.println("El tiempo de servlet Isi Final es: " + isiFinal);
		
		long isiTotal = isiFinal - isiInicio;
		System.out.println("El tiempo de servlet Isi Final es: " + isiTotal);
		
		PrintWriter pw=response.getWriter();
		
		//pw.print("El tiempo de servlet Isi Final es:");
		//pw.println(isiTotal);	
		
		/***Medir tiempo de ejecucion en el servlet de Jorge****/
		
		long jorgeInicio = System.currentTimeMillis();
		System.out.println("El tiempo del servlet Jorge Inicial es: " + jorgeInicio);
		
		request.getRequestDispatcher("LeerXML?URL=http://www.w3schools.com/xml/note.xml").include(request, response);
		//request.getRequestDispatcher("http://172.16.1.37:8090/EjercicioClaseXMLRemoto/ContarElementosXMLServlet").include(request, response);
		
		long jorgeFinal = System.currentTimeMillis();
		System.out.println("El tiempo de servlet Jorge Final es: " + jorgeFinal);
		
		long jorgeTotal = jorgeFinal - jorgeInicio;
		System.out.println("El tiempo de servlet Jorge Final es: " + jorgeTotal);
		
		PrintWriter pw2=response.getWriter();
		
		//pw2.print("El tiempo de servlet Jorge Final es:");
		//pw2.println(jorgeTotal);
		
		if (isiTotal>jorgeTotal)
		{
			pw.print("El tiempo de servlet Isi es mayor");
			pw.print(isiTotal);
		}
		else if (isiTotal<jorgeTotal)
		{
			pw2.print("El tiempo de servlet Jorge es mayor");
			pw2.print(jorgeTotal);
		}else
		{
			
			pw2.print("Los dos tardan lo mismo");
			pw.print(isiTotal);
			pw2.print(jorgeTotal);
		}
			
	}
}
