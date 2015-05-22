package copia.repositorio.todo;

import java.util.Scanner;

public class Alumno_OLD extends Persona_OLD
{
	// esta llamando al constructor de Persona
	
	private enum Tipo_Notas2 {SUSPENSO,APROBADO,BIEN,NOTABLE,SOBRESALIENTE};
	
	//INSUFICIENTE < 5 ,APROVADO 5,BIEN 6 ,NOTABLE 7-8,SOBRESALIENTE 9-10
	
	/*public enum Tipo_Notas2 
	{
		
	}*/
	
	private void Tipo_Notas2()
	{
		Tipo_Notas2 nc=null;
		
		switch (nota) 
		{
		case 10:
			nc= Tipo_Notas2.SOBRESALIENTE;
			break;
		
		case 9:
			nc= Tipo_Notas2.SOBRESALIENTE;
			break;
		
		case 8:
			nc= Tipo_Notas2.NOTABLE;
			break;
		
		case 7:
			nc= Tipo_Notas2.NOTABLE;
			break;
		
		case 6:
			nc= Tipo_Notas2.BIEN;
			break;
		
		case 5:
			nc= Tipo_Notas2.APROBADO;
			break;
		default:
			nc= Tipo_Notas2.SUSPENSO;
			break;
		}
		
	}
	
	private int nota;
		
	
	public Alumno_OLD(String nombre, int edad, int nota)

	{
		super(nombre, edad);
		this.nota= nota;
	}

	//Sobreescribimos el metodo  to String
		@Override
	public String toString()
	{
			String g = new String();
			g = "La persona con el nombre " + super.nombre + " tiene la edad de " + super.edad + "tiene la nota " + this.nota; 
			//g = "La persona con el nombre " + this.nombre + " tiene la edad de " + this.edad + "tiene la nota " + getNota();
			return g;
	
		//return super.toString();
	}
	
	//siempre atributos privados en la clase dando a boton derecho source Generate getter y letter
	//para acceder desde main tengo que poner int noraMain = a.getNota();
	


	public int getNota() 
	{ // Obtener
		//String nombre= null;
		
		int nota;
		
		//Scanner sc1 = new Scanner(System.in);
		
		Scanner sc2 = new Scanner(System.in);
		
		//System.out.println("Introduzca nombre del Alumno");
		//nombre = sc1.next();
		
		System.out.println("Introduzca nota para el alumno :");
		nota = sc2.nextInt();		
		
		return nota;
	}

	public void setNota(int nota) { //Asignar
		this.nota = nota;
	}
	
}
