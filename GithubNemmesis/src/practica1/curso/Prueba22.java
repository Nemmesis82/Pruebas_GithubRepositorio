package practica1.curso;

public class Prueba22 
{
		public static void main(String[] args) 
		{
			
		    String linea = "asfadfbjp349iu'***hola@madrid.org///0sdg99sdg";
		    String mail[] = linea.split(".*\\*{3}");
		 
		    linea = mail[1]; 
		    String mail2[] = linea.split("/{3}.*");
		 
		    System.out.println(mail2[0]);
		   				

					
			
		}
}


