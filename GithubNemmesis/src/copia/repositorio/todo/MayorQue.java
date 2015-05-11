package copia.repositorio.todo;
import java.util.Scanner;
public class MayorQue 
{

	 public static void main(String[] args) 
	 {
		  //declaro las variables a,b,c
	      int a,b,c;
	      
	      Scanner sc = new Scanner(System.in); 	      
	      
	      // aqui pido que me introduzcan los numeros
	      System.out.print("Introduzca primer número: ");
	      
	      //aqui asigno el numero introducido a la variable.
	      a = sc.nextInt();
	      
	      // aqui pido que me introduzcan los numeros
	      System.out.print("Introduzca segundo número: ");
	      
	      //aqui asigno el numero introducido a la variable.
	      b = sc.nextInt();
   	      
	      // aqui pido que me introduzcan los numeros
	      System.out.print("Introduzca tercer número: ");
	      
	      //aqui asigno el numero introducido a la variable.
	      c = sc.nextInt();
	        
	      //Aqui miro si A es mayor que B
	      if(a > b)
	        {
	    	  //aqui miro si A es mayor de C
	           if(a > c)
	           {
	        	   // en el caso que A sea el mayor que B y C imprimo A 
	              System.out.println("El mayor es: " + a);
	           }
	            else
	            {
	            	//si C es mayor que A imprimo C
	            	System.out.println("el mayor es: " + c);
	            }
	        }
	      		//aqui miro si B es mayor de C
	        else if(b > c)
	        {
	        	//en el caso que B sea mayor que C imprimo B
	              System.out.println("el mayor es: " + b);
	        }  
	              else
	                {
	            	  //Sino imprimo C
	                	System.out.println("el mayor es: " + c);
	                }
	        }
	    
}
