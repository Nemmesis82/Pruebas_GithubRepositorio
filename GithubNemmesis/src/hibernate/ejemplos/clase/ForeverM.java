package hibernate.ejemplos.clase;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

public class ForeverM extends HttpServlet  
{
// metodos que vamos a sobreescribir el doGet y doPost
		
	//cuando recibamos una llamada get llamara al metodo doget
	/**
	 * Siempre utilizaremos get para coger el valor, por ejemplo doy 
	 * as.com y quiero ver la pag de as. Leer un empleado, 
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//super.doGet(req, resp);
		String nombre = req.getParameter("Nombre");
		System.out.println(nombre);
		
		/**
		 * con esto hago que los datos que pongo en el box se envien a la consola del
		 * eclipse, con getParameter y la variable req
		 */
		String apellidos = req.getParameter("Apellidos");		
		System.out.println(apellidos);
		
				
		/**
		 * Ahora pondre lo que devuelvo
		 */
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		pw.write("El numero de letras que tiene el nombre es = "+ nombre.length());
		pw.write("<br>");
		pw.write("El numero de letras que tiene el apellido es = "+ apellidos.length());
		//pw.print("Hola Rutiiiiiii");
		
		/**
		 * GgetMethod()
		 * get RemoteAdrr()
		 * valor getHeader(nombre del parametro)
		 * valor getParameter(nombre)
		 * getQueryString().URL
		 */
	}

	//cuando recibamos una llamada post llamara al metodo dopost
	/**
	 * el post envia informacion pero modifica el estado en el servidor, 
	 * (insert, update, etc)
	 */
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
	
		System.out.println("Ha llamado a doPost Ruth");
		
		//super.doPost(req, resp);
	}
	
	/**
	 * metodo que siempre se ejecuta es service()
	 */
	@Override
		public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException 
		{
		System.out.println("Ha llamado a service :-P");
			//super.service(arg0, arg1);
		}

	/**
	 * hacer mapping entre la url y el servlet se especifica en web.xml para hacer la unión
	 * es como un dns, un nombre logico a una clase de java.
	 * Ahora editamos web.xml
	 * debajo de </welcome-file-list> añadimos dos elementos
	 */
	
	/**
	 * Tipo Mime seTContentType(tipo MIME)
	 * getWriter();
	 */
}
