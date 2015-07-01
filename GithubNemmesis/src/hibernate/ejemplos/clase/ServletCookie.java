package hibernate.ejemplos.clase;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("unused")
public class ServletCookie extends HttpServlet 
{
	private final Logger log = LogManager.getRootLogger();
	
	private static final long serialVersionUID = 1L;
	/**
	 * Hacer una cooki para controlar nº de veces que un clientes utiliza un servicio
	 * solo 2 veces y a la 3 se lo denegamos
	 *	
	 */
	    
    public ServletCookie(){
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Cookie ck=null;
		ck=obtenerCookie(request, "Ruth");
		PrintWriter pw = response.getWriter();
		Cookie [] cookies =null;
		pw.print(ck);
		
	}
	
	private Cookie obtenerCookie(HttpServletRequest req, String nombre_cookie)
	{
		Cookie ck1=null;
		
		/***
		 * Obtengo array de cookie
		 */
		
		Cookie [] cookies =null;
		
		cookies=req.getCookies();
		
		//Para verificar si esta o no la cookie
		boolean encontrada = false;
		
		//Para hacer el bucle del while
		int posicion =0;
		
		//para almacenar el valor en el while para almacenar los valores temporales del array de cookies
		Cookie ckAux=null;
		
		/**
		 * Si el valor es igual a null
		 */
		
		if(null==cookies)
		{
			/**
			 * Creo una cookie
			 */
			ck1=new Cookie(nombre_cookie,"0");
		}
		else
		{
			//Si en la posicion del array no esta nuestra cookie y no esta encontrada
			while ((posicion<cookies.length)&&(!encontrada)) 
			{
				//Aqui le asigno el valor ckAux al array de cookies
				ckAux=cookies[posicion];
				
				if(ckAux.getName().equals(nombre_cookie))
					{
						encontrada=true;
						//aqui como la he encontrado la asigono a la cookie creada nueva para devolver
						//el valor
						ck1=ckAux;
					}
				else 
				{
					posicion++;
				}//fin de if/else

			}// fin de while
			
			//Aqui es que si despues del While no ha sido encontrada
			//creo una nueva cooki
			if(!encontrada)
			{
			ck1=new Cookie(nombre_cookie,"0");
			}
		}
	  return ck1;
	}

}
