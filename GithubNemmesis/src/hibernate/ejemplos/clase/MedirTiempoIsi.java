package hibernate.ejemplos.clase;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


public class MedirTiempoIsi implements Filter 
{

    
    public MedirTiempoIsi(){
        
    }

	
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc) throws IOException, ServletException 
	{
		long isiInicio = System.currentTimeMillis();
		System.out.println("El tiempo del servlet Isi Inicial es: " + isiInicio);
		
		fc.doFilter(req, res);
		
		long isiFinal = System.currentTimeMillis();
		System.out.println("El tiempo de servlet Isi Final es: " + isiFinal);
		
		long isiTotal;
		
		isiTotal= isiFinal-isiInicio;
		
		System.out.println("El tiempo de servlet Isi Final es: " + isiTotal);
		
		req.setAttribute("TiempoIsi",isiTotal);
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException 
	{
		
	}

}
