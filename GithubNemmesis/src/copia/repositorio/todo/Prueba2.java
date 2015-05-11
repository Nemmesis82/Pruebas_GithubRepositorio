package copia.repositorio.todo;
//otra forma de la que ha dicho Valeriano pero no usao el split
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prueba2 
{

	//ESTE ESTA CORRECTO
	public static void main(String[] args) 
	{
	
			String linea = "asfadfbjp349iu'***hola@madrid.org///0sdg99sdg***ruth@gmail.com///";
	        //String email;
	        Pattern pat = Pattern.compile(".*@.*");
	        Matcher mat = pat.matcher(linea);
	        int u=0;
	        int a=0;
	        String mail = new String();
	        
	        //System.out.println(linea);
	     

	        if(mat.matches())
	       {
	        	u=linea.indexOf("***");
           	 	a=linea.indexOf("///");
          	 	u = u+3;
          	 	mail+= linea.substring(u,a);
          	 	System.out.println(mail);
          	 	//System.out.println("Correo Válido");
	       }
	        else
	        {
	          System.out.println("Correo No Válido");
	        }

	}

}
