package hibernate.ejemplos.clase;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Filtro implements Filter
{

	@Override
	public void destroy() 
	{
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unused")
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc) throws IOException, ServletException 
	{
		HttpServletRequest req2 = (HttpServletRequest) req;
		HttpServletResponse res2 = (HttpServletResponse)res;
		HttpSession se =req2.getSession(false);
		
		String s=null;
		s=req2.getRequestURI();
			
		if (null != s)
		{
			fc.doFilter(req, res);

		}
		else
		{
			//s=req2.getRequestURI();
		
			
			if (s.equals("/RuthWebProyect/login.html")||(s.equals("/RuthWebProyect/LoginServlet")))
					{
						System.out.println("Llega correctamente");
						fc.doFilter(req,res);
					}
			else
			{ 
						res2.sendRedirect("login.html");
			}
		}
//		
//		/**
//		 * Esto es para medir el tiempo
//		 */
//		
//		long tiempo1 = System.currentTimeMillis();
//		System.out.println("El tiempo 1");
//		System.out.println(tiempo1);
//		
//		/**
//		 * Esto hace la llamada a doget de Nuevo pedir empleado
//		 */
//		//fc.doFilter(req, res);
//		
//		long tiempo2 = System.currentTimeMillis();
//		System.out.println("El tiempo 2");
//		System.out.println(tiempo2);
//		
//		long tiempo3 = tiempo2 - tiempo1;
//		System.out.println("El tiempo 3");
//		System.out.println(tiempo3);
//		/**
//		 * Medir en la aplicacion cuanto tarde )en leer un empleado con
//		 * hibernate y con jdbc opr filtros
//		 * 
//		 * utilizar dentro del filtro tenemos que mirar cuantos accesos hay
//		 * lo utilizamos con el servertl context
//		 * 
//		 * jdbc es empleado DAO
//		 * 
//		 * hibernate es empleado hibernateDAO
//		 * 
//		 */
//		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	
}
