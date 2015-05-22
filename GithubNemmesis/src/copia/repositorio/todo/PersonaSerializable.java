package copia.repositorio.todo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersonaSerializable implements Serializable
{

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
	
		Persona_OLD p8 = new Persona_OLD("Ruth", 33);
		
		
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("EscribirDatos.dat"));
			oos.writeObject(p8);
			oos.close();
			}
		
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Esto es la escritura del objeto EscribirDatos.dat con datos de p8: ");
		System.out.println(p8);
					
			try 
			{
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("EscribirDatos.dat"));
				Object aux = ois.readObject();
				
				if (aux instanceof Persona_OLD)
				{
					System.out.print("Esto es la lectura del fichero Escribir Datos y lo asigno al objeto Aux: ");
			        System.out.println(aux);  // Se escribe en pantalla el objeto
			        //aux = ois.readObject();
				}
				ois.close();
			} 
			catch (ClassNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}

}
