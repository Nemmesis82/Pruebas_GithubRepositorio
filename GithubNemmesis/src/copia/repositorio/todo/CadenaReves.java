package copia.repositorio.todo;

import java.util.Scanner;

//HACER UN M�TODO QUE RECIBA UNA CADENA Y LA DEVUELVA ALREV�Ss
public class CadenaReves 
{
	public static void main(String[] cadena)
	{
		String cadenareves=null;
		String cadena1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca palabra que quiere que imprima al reves: ");
		cadena1 = sc.next();
		
		cadenareves= "";		
		
		for (int i=cadena1.length()-1; i >= 0;i--)
		{
			cadenareves = cadenareves + cadena1.charAt(i);
			
			System.out.println(cadenareves);
		}

		
	}

}
