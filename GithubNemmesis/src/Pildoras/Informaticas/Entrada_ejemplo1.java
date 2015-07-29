package Pildoras.Informaticas;

import java.util.*;

public class Entrada_ejemplo1 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario = entrada.nextLine();
		// Se qda a la espera de que pongamos en la pantalla y lo guarda en la variable nombre_usuario
		
		System.out.println("Introduce edad, por favor");
		
		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad + 1) + " años.");		
		
	}

}
