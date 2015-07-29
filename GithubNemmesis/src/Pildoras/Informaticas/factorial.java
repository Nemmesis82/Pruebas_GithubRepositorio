package Pildoras.Informaticas;

import javax.swing.*;

public class factorial {

	public static void main(String[] args) 
	{

		//averiguar un factorial
		long resultado = 1L;
		
		int numero= Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
		
		//Bucle decreciente
		//mientras i sea mayor que 0 se haga la sentencia
		
		for (int i = numero; i > 0; i--) 
		{
		// si el resultado es igual a 1  se multiplica por el valor que tiene i e i tiene el valor de lo introducido en el numero, y se va decrementando.
			resultado= resultado*i;
		}
		

		System.out.println("El factorial del numero " + numero + " es " + resultado);

	}

}
