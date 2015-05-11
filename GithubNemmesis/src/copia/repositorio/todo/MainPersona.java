package copia.repositorio.todo;
//import java.util.Scanner;

public class MainPersona
{
	//pedir datos Nombre y Edad 
	
	//pedir nombre
	
			//	static String pedirNombre()
			//{
			   // 	Las funciones siempre va la primera miniscula y despues la siguiente mayuscula

		//		String nombre = null; //declaro e inicializo la variable a null
				
	//			Scanner sca= new Scanner(System.in); //pido por scanner para que introduzca el nombre
		//		
			//	System.out.println("Introduzca Nombre: "); // aqui entro y pongo el nombre
				//
			//	nombre = sca.next(); //aqui lo asigno a la variable nombre desde el scanner
				
				//System.out.println(nombre); //aqui imprimo el nombre
				
				//sca.close(); // cierro el scanner
				
			//	return nombre; // esto es lo que devuelve
		//	}

	//pedir edad

		//	static int pedirEdad()
		//	{
		//		int edad; //declaro la edad
				
		//		Scanner sc= new Scanner(System.in); // pido por scanner para que introduzca la edad
				
		//		System.out.println("Introduzca Edad: "); // Aqui entro y pongo la edad
				
		//		edad = sc.nextInt();// aqui lo asigno a la edad
				
				//System.out.println(edad); //aqui lo imprimo
				
				//sc.close(); // cierro el scanner
				
	//			return edad; //y devuelvo edad
		//	}
	
			//almacenarlo o construir un objeto persona
			
			// mostrar persona
			
		public static void main(String []args)
		{
			String s_nombremain = null; // creo el s_nombremain para que recoja el valor de pedirNombre
			int s_edadmain=0; // creo el s_edadmain para que recoja el valor de pedirEdad
			
			//          s_nombremain= pedirNombre(); //Aqui asigno lo que me devuelve la función pedirNombre a s_nombremain
			//          System.out.println("Introduzca Nombre1: "); // Aqui pido que me introduzca el nombre por la pantalla
			
			//          s_edadmain= pedirEdad(); //Aqui asigno lo que me devuelve la función pedirEdad a s_edadmain
			//          System.out.println("Introduzca Edad1: "); // Aqui pido que me introduzca la edad por la pantalla
			
			//definir objeto para hacer una instancia persona
			
			// doy los datos de nombre y edad a p
			
			
			
			          Persona p = null;
			          
			          s_nombremain= PedirDatos.pedirNombre(); //Aqui asigno lo que me devuelve la función pedirNombre a s_nombremain
						//System.out.println("Introduzca Nombre1: "); // Aqui pido que me introduzca el nombre por la pantalla
						
					  s_edadmain= PedirDatos.pedirEdad(); //Aqui asigno lo que me devuelve la función pedirEdad a s_edadmain
					  
					  //p= PedirDatos.MasEdad(s_nombremain, s_edadmain);
					  
					  //System.out.println("Introduzca Edad1: "); // Aqui pido que me introduzca la edad por la pantalla
					 
					  p = new Persona (s_nombremain, s_edadmain);
					  
			         // p = new Persona ("Ruth",33);
			         
			       // doy los datos de nombre y edad a s
			         // Persona s = null;
			        
			          //s_nombremain= PedirDatos.pedirNombre(); //Aqui asigno lo que me devuelve la función pedirNombre a s_nombremain
						//System.out.println("Introduzca Nombre1: "); // Aqui pido que me introduzca el nombre por la pantalla
						
					//  s_edadmain= PedirDatos.pedirEdad(); //Aqui asigno lo que me devuelve la función pedirEdad a s_edadmain
					  //System.out.println("Introduzca Edad1: "); // Aqui pido que me introduzca la edad por la pantalla
								          
			         // s =new Persona (s_nombremain, s_edadmain);
			          //s = new Persona ("Esther",31);

			          // doy los datos de nombre y edad a t
			          /*Persona t = null;
			          //t = p;//modifico el nombre t
			          //t.nombre= "Laura";
			         
			          s_nombremain= PedirDatos.pedirNombre(); //Aqui asigno lo que me devuelve la función pedirNombre a s_nombremain
						//System.out.println("Introduzca Nombre1: "); // Aqui pido que me introduzca el nombre por la pantalla
						
					  s_edadmain= PedirDatos.pedirEdad(); //Aqui asigno lo que me devuelve la función pedirEdad a s_edadmain
					  //System.out.println("Introduzca Edad1: "); // Aqui pido que me introduzca la edad por la pantalla
					
			          t =new Persona (s_nombremain, s_edadmain);*/
			         
			          // aqui paso la llamada de comparacion de p y t
			          
			       // p.equals(t);//t es el objetc esto es la llamada
			         
			         //System.out.println(p.nombre);
//dia 27 sobrecarga del override toString
			         System.out.println(p.toString());  	
			        					  
			//          p.mostrar(); // Muestra la persona p
			//          s.mostrar(); // Muestra la persona s
			
			        /*  if (p == t) 
			          {
						System.out.println("Si son iguales");
			          } 
			          else 
			          {
			        	  System.out.println("No son iguales");
			          }
			          */
			          					
			/*for (int cont=1; cont<6;cont++) // % es el modulo que es el resto de una division solo el resto es de 0 a 5
			{
			
				s_nombremain= PedirDatos.pedirNombre(); //Aqui asigno lo que me devuelve la función pedirNombre a s_nombremain
				//System.out.println("Introduzca Nombre1: "); // Aqui pido que me introduzca el nombre por la pantalla
				
				s_edadmain= PedirDatos.pedirEdad(); //Aqui asigno lo que me devuelve la función pedirEdad a s_edadmain
				//System.out.println("Introduzca Edad1: "); // Aqui pido que me introduzca la edad por la pantalla
			
				Persona p = null;
				p = new Persona (s_nombremain, s_edadmain);
			
				//p.mostrar(); // Muestra la persona p
				
				if (p.esMayorEdad()) //Muestro si es mayor de edad
				{
					System.out.println("Esta persona es mayor de edad");
				}
				
				else
				{
					System.out.println("Esta persona es menor de edad");
				}
				//System.out.println("Numero de personas introducidas:");
				//System.out.println(cont);
				
			}*/
			         //Esta las lalmada en pedir datos
			        // Persona p3= PedirDatos.MasEdad(p, 20); //Solo va a mas edad
			         //System.out.println(p3);//imprimo p3
			         
			      //Llamada a Medad en persona.
			         p.Medad(40);
			         System.out.println(p);
			
		}
			
		
}
