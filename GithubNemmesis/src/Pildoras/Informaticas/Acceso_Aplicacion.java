package Pildoras.Informaticas;

import javax.swing.*;

public class Acceso_Aplicacion
{

	public static void main(String[] args) 
	{
	
		//contrase�a q adivinar
		String clave="Ruth0945";
		
		//Contrase�a
		
		String pass="";
		
		//Mientras que la clave no sea igual a la pass hacer lo siguiente 
		
		while (clave.equals(pass)==false)
		
		{
			pass=JOptionPane.showInputDialog("Introduce la contrase�a, por favor ");

				if (clave.equals(pass)==false)
				{
					System.out.println("Contrase�a incorrecta");
				}
				
		}
    	System.out.println("Contrase�a correcta. Acceso permitido");
	}

}
