package Pildoras.Informaticas;

import javax.swing.*;

public class Acceso_Aplicacion
{

	public static void main(String[] args) 
	{
	
		//contraseņa q adivinar
		String clave="Ruth0945";
		
		//Contraseņa
		
		String pass="";
		
		//Mientras que la clave no sea igual a la pass hacer lo siguiente 
		
		while (clave.equals(pass)==false)
		
		{
			pass=JOptionPane.showInputDialog("Introduce la contraseņa, por favor ");

				if (clave.equals(pass)==false)
				{
					System.out.println("Contraseņa incorrecta");
				}
				
		}
    	System.out.println("Contraseņa correcta. Acceso permitido");
	}

}
