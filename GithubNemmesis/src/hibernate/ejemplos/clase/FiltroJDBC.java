package hibernate.ejemplos.clase;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FiltroJDBC implements Filter
{

	@Override
	public void destroy() 
	{
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain fc) throws IOException, ServletException
	{
	
		long tiempo01 = System.currentTimeMillis();
		System.out.println("El tiempo JDBC 1" + tiempo01);
		
		
		/**
		 * Esto hace la llamada a doget de Nuevo pedir empleado
		 */
		fc.doFilter(req, res);
		
		long tiempo02 = System.currentTimeMillis();
		System.out.println("El tiempo JDBC 2" + tiempo02);
		
		
		long tiempo03 = tiempo02 - tiempo01;
		System.out.println("El tiempo JDBC 3" + tiempo03);
		System.out.println("La resta de tiempo 02 menos tiempo 01" + tiempo02 + " - " + tiempo01);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
