package copia.repositorio.todo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Properties;

import org.apache.log4j.Logger;

//import javax.management.openmbean.ArrayType;

public class ListaPersonas implements Iterable<Persona>
{
	
	public static final int CAPACIDAD = 10; //constante
	
	int cima=0; //numero de personas para saber hasta cuando esta lleno las personas del array
	
	private Persona[] array_personas;
	
	private final static Logger log = Logger.getLogger("mylog");
	
	public static void PruebaLogs ()
	{
		log.error("JODER CON LOS Q TOCAN!!!!!");
		log.info("Informando...");
		log.warn("Cuidaito!!!!!");
		log.debug("A es igual a 12");
		log.trace("A que no sales!");
	}
	/**
	 * Es muy posible que haga falta añadir algún campo más
	 */
	
	public ListaPersonas()
	{
		//TODO HAY QUE HACER UN CONSTRUCTOR
		
		/*for (int i = 0; i < array_personas.length; i++) 
		{
			this.array_personas[i]=null;
			System.out.println(this.array_personas[i]);
		}*/
		
		this.array_personas = new Persona [CAPACIDAD];
			
		//RECUERDA QUE EL CONSTRUCTOR SIRVE PARA
			//RESERVAR MEMORIA
			//INICIALIZAR EL ESTADO DEL OBJETO Y SUS ATRIBUTOS
		
	}
	
	public Persona[] getListaPersonas ()
	{
		//TODO HAY QUE DEVOLVER EL ARRAY DE PERSONAS QUE CONFORMAN LA LISTA
		/*Persona[] listap = null;
		
			
		for (int i = 0; i < listap.length; i++) 
		{
			
			listap[i]= array_personas[i];
			System.out.println(listap[i]);
			
		}*/
		
		
		return this.array_personas;
	}
	
	public Persona buscarPersona (String nombre)
	{
		//TODO BUSCAR PERSONA POR NOMBRE Y DEVOLVERLA
		//SI NO ESTÁ, DEVOLVER NULO
		Persona q = null;
		boolean buscarnom = false;
		int cont = 0;
		while((numeroPersonas()!= 0)&&(!buscarnom)&&(cont < CAPACIDAD))
		{
			if(nombre.equals(array_personas[cont].getNombre()))
			{
				buscarnom = true;
				q = array_personas[cont];
			
			}
			cont++;
		}
				
		return q;
	}
	
	public Persona busarPersona (int edad)
	{
		//TODO BUSCAR PERSONA POR EDAD Y DEVOLVERLA
		//SI NO ESTÁ, DEVOLVER NULO
		Persona q = null;
		boolean buscarnom = false;
		int cont = 0;
		while((numeroPersonas()!= 0)&&(!buscarnom)&&(cont < this.array_personas.length))
		{
			if(edad==(array_personas[cont].getEdad()))
			{
				buscarnom = true;
				q = array_personas[cont];
			}
			cont++;
		}
				
		return q;
	}
	
	public boolean serializar ()
	{
		//Hacer uso del fichero de propiedades serializa.properties, 
		//para obtener de él el valor de la clave destino, 
		//que representa el nombre del fichero de salida
		boolean r = false;
		FileInputStream fis= null;
		try
		{
			fis = new FileInputStream("c:\\Users\\alumno\\Desktop\\clases Ruth 703\\Mayo\\Clase14\\serializa.properties");
		} 
		catch (FileNotFoundException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Properties properties = new Properties();
		
		ObjectOutputStream oos = null;
		File file = null;
		try
			{
				properties.load(fis);//cargo las propiedades de serializa	
				
				file = new File(properties.getProperty("destino"));
		
				file.createNewFile();
				
				oos = new ObjectOutputStream(new FileOutputStream(properties.getProperty("destino")));
				
				oos.writeObject(array_personas);
				
				r = true;
				oos.close();
			}
		
			catch (Exception e )
			{
				System.out.println("Error al escribir el fichero " + properties.getProperty("destino"));
				
			}
						
			return r;
		
	}
	
	public boolean deserializar()
	{
		boolean r = false;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c:\\Users\\alumno\\Desktop\\clases Ruth 703\\Mayo\\Clase14\\serializa.properties");
		}
		catch (FileNotFoundException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Properties properties = new Properties();
		
		ObjectInputStream ois = null;
		File file = null;
		try
		{
			
			properties.load(fis);//cargo las propiedades de serializa	
			file = new File(properties.getProperty("destino"));
			file.createNewFile();
			ois = new ObjectInputStream(new FileInputStream(properties.getProperty("destino")));
			this.array_personas =(Persona [])ois.readObject();
			r = true;
			ois.close();
		}
		catch (Exception e )
		{
			System.out.println("Error al escribir el fichero "+properties.getProperty("destino"));
		
		}
					
				
			return r;
	}
	
	//public void insertarPersona (Persona p) //throws InsertarPersonaException
	
	public void insertarPersona (Persona p) //throws InsertarPersonaException
	{
		//que las persona insertada no sean iguales
		//no se puede insertar una persona si es igual
	
		if (!estaLlena())
				{
					//si tengo espacio para insertar	
					
					if(numeroPersonas()!=0)
					{
						if(buscarPersona(p.getNombre())== null) 
						{
							System.out.println("num de per "+numeroPersonas() );
							array_personas[numeroPersonas()]=p;
						
						}
						else
						{
							System.out.println("Ya existe esa persona");
						}
					}
					else
					{
						array_personas[0]=p;
					}
				}
				else
				{
					System.out.println("Capacidad limite alcanzada!!!");
					/////throw new InsertarPersonaException();
				}
		
	}
	
	public int numeroPersonas()
	{
		int respuesta = 0;
		for (int i = 0; i < CAPACIDAD; i++) 
		{
			if(this.array_personas[i]!=null)
			{
				respuesta++;
			}
		}
		return respuesta;
	}
	
	public boolean estaLlena()
	{
		return numeroPersonas()==CAPACIDAD;
	}
	
	public void mostrar()
	{
		//TODO MOSTRAR LA LISTA DE PERSONAS
		// pista: ayudarse del método toString de persona
		if (numeroPersonas() > 0)
		{
			for (int i = 0; i < numeroPersonas(); i++) 
			{
				System.out.println("Persona("+(i+1)+"): "+array_personas[i].toString());
			}
		}
		else
		{
				System.out.println("No hay personas que mostrar");
		}
	}

	//ELIMIAR PERSONA POR EL NOMBRE
	public void eliminarPersona(Persona p)
	{
		int posicionBorrar = -1;
		int contador = 0;
		int numPer =numeroPersonas();
		
		System.out.println(!buscarPersona(p.getNombre()).getNombre().equals(null));
		
		if(numPer!=0)
		{
			if(!(buscarPersona(p.getNombre()).getNombre().equals(null)))
			{
			
				while ((posicionBorrar ==-1)&&(contador < CAPACIDAD)) 
				{
					if(p.getNombre().equals(array_personas[contador].getNombre()))
					{
						posicionBorrar = contador;	
					}	
					contador++;
				}
				if (posicionBorrar == -1)
				{
					System.out.println("El nombre no existe!!!");
				}
				else
				{
					int j=0;
					for (int i = 0; i < CAPACIDAD; i++) 
					{
						if(i!=posicionBorrar)
						{
							array_personas[j]=array_personas[i];
							j++;
						}	
					}
					array_personas[numPer]=null;
				}	
				
				
			}
			else
			{
				System.out.println("No se puede borrar una persona que no existe");
			}	
		}
		else
		{
			System.out.println("No hay personas que borrar");
		}
		
	}

	@Override
	public Iterator<Persona> iterator() 
	{
		// TODO Auto-generated method stub
		return null;
	}
		
}
