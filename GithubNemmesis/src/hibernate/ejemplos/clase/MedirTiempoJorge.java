package hibernate.ejemplos.clase;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.sun.org.apache.xml.internal.serialize.Printer;


public class MedirTiempoJorge implements Filter {

  
    public MedirTiempoJorge() {
       
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc) throws IOException, ServletException 
	{
				
		long jorgeInicio = System.currentTimeMillis();
		System.out.println("El tiempo del servlet Jorge Inicial es: " + jorgeInicio);
		
		fc.doFilter(req, res);
		
		long jorgeFinal = System.currentTimeMillis();
		System.out.println("El tiempo de servlet Jorge Final es: " + jorgeFinal);
		
		long jorgeTotal = System.currentTimeMillis();
		System.out.println("El tiempo de servlet Jorge Final es: " + jorgeTotal);
	
		
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException 
	{
		
	}

}
