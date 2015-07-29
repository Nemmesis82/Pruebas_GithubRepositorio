package Pildoras.Informaticas;

import javax.swing.*;

public class Acceso_Aplicacion
{

	public static void main(String[] args) 
	{
	
		//contraseña q adivinar
		String clave="Ruth0945";
		
		//Contraseña
		
		String pass="";
		
		//Mientras que la clave no sea igual a la pass hacer lo siguiente 
		
		while (clave.equals(pass)==false)
		
		{
			pass=JOptionPane.showInputDialog("Introduce la contraseña, por favor ");

				if (clave.equals(pass)==false)
				{
					System.out.println("Contraseña incorrecta");
				}
				
		}
    	System.out.println("Contraseña correcta. Acceso permitido");
	}

}
