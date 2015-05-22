package copia.repositorio.todo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MainRecorrer 
{

	
	public static void main(String[] args) 
	{
		ArrayList<Persona> nA = new ArrayList<Persona>();
		
		Persona p = new Persona("Ruth", 33);
		
		Persona p2 = new Persona("Esther", 31);
		
		Persona p3 = new Persona("Carlos", 32);
					
		nA.add(p3);
		
		nA.add(p2);
		
		nA.add(p);
		/*
		//System.out.println(nA);
		Iterator<Persona> i_Persona= nA.iterator();
		
		while (i_Persona.hasNext())
		{
			Persona pi=i_Persona.next();
			
			//System.out.println(i_Persona.next());
			
			System.out.println(pi);
		}
		*/
		/* el string es el nombre*/
		Map<String, Persona> miP= new HashMap<String,Persona>();
		miP.put(p.getNombre(), p);
		miP.put(p2.getNombre(), p2);
		miP.put(p3.getNombre(), p3);
		//System.out.println(miP);
		
		miP= new LinkedHashMap<String,Persona>(miP);
		
		System.out.println(miP);
		
		Persona p4 = new Persona("Fernando", 65);
		
		miP.put(p4.getNombre(), p4);
		
		System.out.println(miP);
		
		miP = new TreeMap<String,Persona>(miP);
		
		System.out.println(miP);
		
		Persona p5 = new Persona("Rosa", 65);
		
		miP.put(p5.getNombre(), p5);
		
		System.out.println(miP);
		
		Persona p6 = new Persona("Xiomara", 31);
		
		miP.put(p6.getNombre(), p6);
		
		System.out.println(miP);
		
		Alumno a1 = new Alumno("Ruth",33, 8);
		Alumno a2 = new Alumno("Esther",30, 6);
		Alumno a3 = new Alumno("Sonia",18, 5);
		Alumno a4 = new Alumno("Alvaro",22,3);
		
		//mostrar notas de los alumnos
		Map<Integer,Alumno> tM= new TreeMap<Integer,Alumno>();
		
		tM.put(a1.getNota(),a1);
		tM.put(a2.getNota(),a2);
		tM.put(a3.getNota(),a3);
		tM.put(a4.getNota(),a4);
		
		System.out.println("La nota de los alumnos "+ a1.getNombre()+ " es: " + a1.getNota());
		System.out.println("La nota de los alumnos "+ a2.getNombre()+ " es: " + a2.getNota());
		System.out.println("La nota de los alumnos "+ a3.getNombre()+ " es: " + a3.getNota());
		System.out.println("La nota de los alumnos "+ a4.getNombre()+ " es: " + a4.getNota());

		System.out.println(tM);
		//Comparar edad
		
		//Persona p = new Persona("Ruth", 33);
		//Persona p2 = new Persona("Esther", 31);
		//Persona p3 = new Persona("Carlos", 32);
		//Persona p4 = new Persona("Fernando", 65);
		//Persona p5 = new Persona("Rosa", 61);
		//Persona p6 = new Persona("Xiomara", 31);
		
		Set<Persona> tS= new TreeSet<Persona>();
				
		tS.add(p);
		tS.add(p2);
		tS.add(p3);
		tS.add(p4);
		tS.add(p5);
		tS.add(p6);		
		
		//p.compareTo(p2);
		//p.compareTo(p5);
		//p2.compareTo(p6);
		
	}

}
