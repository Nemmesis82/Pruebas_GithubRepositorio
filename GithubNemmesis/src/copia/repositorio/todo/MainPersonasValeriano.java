package copia.repositorio.todo;

import java.util.ArrayList;



public class MainPersonasValeriano 
{
	
	public static void main(String[] args) //throws InsertarPersonaException, IOException 
	{
				
		/*
		// TODO Auto-generated method stub
		ListaPersonas lp = new ListaPersonas();
		Persona p = new Persona("Laura", 12);
		
		//Muestro el método mostrar
		lp.mostrar();
		
		//System.out.println("mostrar1 Método Mostrar");

		//Muestro el método deserializar
		lp.deserializar();
		
		//System.out.println("mostrar2 Deserializar");
		
		//Muestro el método mostrar
		
		lp.mostrar();
		
		//System.out.println("mostrar3 Método Mostrar");
		
		//Muestro el método insertar persona
		
		lp.insertarPersona(p);
		
		//System.out.println("mostrar4 Insertar persona");

		//Muestro el método mostrar
		lp.mostrar();
		
		//System.out.println("mostrar5 Método Mostrar");
		
		//Muestro el método insertar persona
		lp.insertarPersona(p);
		
		//System.out.println("mostrar6 Insertar persona");
		
		//Muestro el método mostrar
		lp.mostrar();
		
		//System.out.println("mostrar7 Método Mostrar");
		
		//Muestro el método elimiar persona
		lp.eliminarPersona(p);
		
		//System.out.println("mostrar8 Elimiar persona");
		
		//Muestro el método mostrar
		lp.mostrar();
		
		//System.out.println("mostrar9 Método Mostrar");
		
		//Muestro el método insertar persona
		lp.insertarPersona(p);
		
		//System.out.println("mostrar10 Insertar persona");
		
		//Muestro el método mostrar
		lp.mostrar();
		
		//System.out.println("mostrar11 Método Mostrar");
		
		//System.out.println(lp.serializar());
		*/
//******************************************************************************//
		//arraylist del objeto persona y se llama nA lo inicializo a 0
		
		ArrayList<Persona> nA = new ArrayList<Persona>();
		
		Persona p = new Persona("Ruth", 33);
		Persona p2 = new Persona("Esther", 31);
				
		nA.add(p2);
		nA.add(p);
		
		//Añadir de forma con el bucle for
		
		for (Persona persona : nA) 
		{
			System.out.println(persona);
			System.out.println(nA);
		}
		//nA.remove(p2);
		//System.out.println(nA);
		
		//Forma de añadir sin for de forma manual
//		nA.add(p);
//		nA.add(p2);
//		System.out.println(nA);
//		nA.remove(p2);
//		System.out.println(nA);
//						
		ListaPersonas.PruebaLogs();
	}
}
