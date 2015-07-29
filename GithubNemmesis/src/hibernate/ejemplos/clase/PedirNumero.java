package hibernate.ejemplos.clase;
import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class PedirNumero extends HttpServlet
{
	static int respuesta;
	
	static  boolean adivino;

	static  String pista;

	static int numIntentos;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException 
	{
		 numIntentos++;
	        int g;
	        String numero=req.getParameter("numero");

	        try {
	            g = Integer.parseInt(numero);
	        } catch (NumberFormatException e) {
	            g = -1;
	        }
	        if (g == respuesta) {
	            adivino = true;
	        } else if (g == -1) {
	            pista = "un número";
	        } else if (g < respuesta) {
	            pista = "uno más grande";
	        } else if (g > respuesta) {
	            pista = "uno más chico";
	        }
	}
		

	  public PedirNumero() {
	        reset();
	    }
	   
	    public static boolean getAdivino() {
	        return adivino;
	    }

	    public static String getPista() {
	        return "" + pista;
	    }

	    public static int getNumIntentos() {
	        return numIntentos;
	    }

	    public void reset() {
	        respuesta = Math.abs(new Random().nextInt() % 100) + 1;
	        adivino = false;
	        numIntentos = 0;
	    }
	
}
