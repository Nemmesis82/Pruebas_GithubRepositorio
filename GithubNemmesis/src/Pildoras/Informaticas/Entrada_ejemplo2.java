package Pildoras.Informaticas;

import javax.swing.JOptionPane;


public class Entrada_ejemplo2 
{

	public static void main(String[] args) 
	{

		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad, por favor ");

		int edad_usuario = Integer.parseInt(edad);
		
		System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendras " + (edad_usuario +1) + " a�os.");

	}

}
