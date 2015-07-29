package Pildoras.Informaticas;

import java.util.Scanner;

public class Adivina_Numero 
{
	public static void main(String[] args) 
	{
		int aleatorio= (int)(Math.random()*100);
		
		//con esta random hacemos que haga aleatorio un numero
		//System.out.println(Math.random()*100);
		//System.out.println(aleatorio);
		//ahora haremos una refuncion quitar los decimales
		
		Scanner entrada= new Scanner(System.in);
		
		int numeros=0;
		
		int intentos=0;
		
		//while (numeros!=aleatorio)
		do
		{
		
			System.out.println("Introduce un número, por favor");
			
			numeros=entrada.nextInt();
			
			if (aleatorio<numeros)
				{
					intentos=intentos+1;
					System.out.println("Mas bajo");
					
				}
			else if (aleatorio>numeros)
				{
					intentos=intentos+1;
					System.out.println("Mas alto");

				}
		}while (numeros!=aleatorio);
		
		System.out.println("Correcto");
		System.out.println("El número de intentos son : " + intentos);
	}

}
