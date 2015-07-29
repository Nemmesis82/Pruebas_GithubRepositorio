package hibernate.ejemplos.clase;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PNum extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	int respuesta = 0;
	
	 boolean adivino;

	 String pista;

	 int numIntentos = 0;
	
	
    public PNum() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 
		 numIntentos++;
	        
		 int g;
	     
		 String numero=request.getParameter("numero");

	     
		 try {
	     
			 g = Integer.parseInt(numero);
	        
		 } catch (NumberFormatException e) {
	     
			 g = -1;
	        
		 }
	        
		 if (g == respuesta) 
		 {
	     
			 adivino = true;
	        
		 } else if (g == -1) {
	            
			 pista = "un número";
	        
		 } else if (g < respuesta) {
	            
			 pista = "uno más grande";
	        
		 } else if (g > respuesta) {
	            
			 pista = "uno más chico";
	        
		 }
		
	}

	 public  boolean getAdivino() {
	        return adivino;
	    }

	    public  String getPista() {
	        return "" + pista;
	    }

	    public  int getNumIntentos() {
	        return numIntentos;
	    }

	    public void reset() {
	        respuesta = Math.abs(new Random().nextInt() % 100) + 1;
	        adivino = false;
	        numIntentos = 0;
	    }

}
