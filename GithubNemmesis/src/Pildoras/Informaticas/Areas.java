package Pildoras.Informaticas;

import java.util.*;
import javax.swing.*;

public class Areas 
{

	public static void main(String[] args) 
	{
		//Ponemos Scanner para hacer una peticion de datos	
		Scanner entrada= new Scanner(System.in);

		//Aqui mostramos por pantalla las opciones que queremos que haga		
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
		
		//Aqui creamos una variable a la que asignaremos la eleccion que hemos pedido antes por pantalla
		int figura=entrada.nextInt();
		
		//	Esto es para ver que variables ha cogido figura y segun sea vaya al caso que sea el correcto	
		switch (figura) 
		{
			case 1:
			
				int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce un lado: "));
				//Aqui muestro por pantalla el area del cuadraro con la funcion
				//Math.pow con el lado y las dimension en este caso es 2
				System.out.println("El área del cuadraro es " + Math.pow(lado, 2));
				
				break;

			case 2:
				
				int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
			
				int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
				
				System.out.println("El área del rectangulo es " + base*altura);
			
				break;
				
			case 3:
				
				base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
				
				altura= Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
				
				System.out.println("El área del triangulo es " + (base*altura)/2);
				
				break;
				
			case 4:
				
				int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio: "));
				
				System.out.println("El área del circulo es ");
				
				System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
				
				break;
				
			default:
				
				System.out.println("La opción no es correcta.");
				break;
		}
		
	}

}
