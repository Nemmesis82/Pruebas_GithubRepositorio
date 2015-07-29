package Pildoras.Informaticas;

import javax.swing.JOptionPane;

public class Comprueba_Mail 
{
//Para saber si hay una @ o no y si el mail es válido o no
	
	public static void main(String[] args) 
	{
	
//Usaremos metodos chatAt (Cuenta los caracteres y de q tipo es; este devuelve un chat charArt(int index)), 
// metodo length (longitud de una cadena de caracteres, devuelve un dato de tipo entero)

		//boolean arroba= false; // me devolvera si es correcto true
		int arroba= 0;//para ver si hay mas de una @
		
		boolean punto=false;
		// Aqui el usuario metera el mail
		String mail= JOptionPane.showInputDialog("Introduce Mail: ");
		
		//Ahora es cuando haremos para recorre todo el mail introducido en el string mail hasta el numero menor q la longitud del mail.
		
		//que un correo no tengo almenos un punto.
		
		for (int i = 0; i < mail.length(); i++) 
		{
		
			if (mail.charAt(i)=='@') 
			{
				//arroba= true;
				arroba++;
			}
			
			if (mail.charAt(i)=='.') 
			{
				punto= true;	
			}
								
		}
		
		//if (arroba==true)
		//que el mail tiene una @ y tiene un punto en el correo.
			if (arroba==1 && punto==true)
			{
			
				System.out.println("Si es correcto: " + mail);
			}
			
			else
				
			{
				System.out.println("No es correcto: " + mail);
			}
			
			System.out.println("La longitud del mail es: "+ mail.length());
	}
	
}


