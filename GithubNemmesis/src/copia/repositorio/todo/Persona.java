package copia.repositorio.todo;
//Pedir datos de persona como nombre y edad y despues crear un objeto y mostrarlo por pantalla

public class Persona 
{ 
	//la clase es Persona 

	String nombre; // esta sera la variable donde asignaremos los nombres.
	int edad;  // está será la variable donde asignaremos las edades.
	final static byte mayorEdad=18; //constante con final xq no se va a cambiar.
	
	
	//Es igual a dios objeto
	
	@Override
	public boolean equals(Object o) // o es t de mainPersona SOBREESCRIBIR
	{
		boolean w = false;
		
		Persona d = null;
		
		d = (Persona)o; // esto es el casting es t
		
		/*Comparar o con this campo a campo*/
		
		//creo variable booblean para que me devuelva true o false dependiendo si es o no verdadera.
						
		if ((d.nombre.equals(this.nombre))&&(d.edad==this.edad)) 
		{
			System.out.println("Son iguales");
			w = true; // cambio el valor de la variable segun necesite si esta o no correcta
			
		} 
		else {
			System.out.println("No lo son");
			w = false;
		}
		return w;
	//	return super.equals(o);
	}
	
	//creamos otro metodo diferente al constructor
	/**
	 * Constructor de la clase que recibe los parametros
	 * @param nombre el que recibimos s_nombremain
	 * @param edad el que recibimos s_edadmain
	 */
	public Persona (String nombre, int edad)
	{
		this.nombre = nombre; //el primero es el atributo de la clase, el segundo es el parametro que pasa, este nombre es el nombre que hemos puesto en el mainpersona
		this.edad = edad; // este nombre es el nombre que hemos puesto en el mainpersona
	}

	public void mostrar ()
	{
		System.out.println(this.nombre);
		
		System.out.println(this.edad);
	}
	//Aqui entramos a comprobar la edad si es mayor de 18
	
	public boolean esMayorEdad()
	
	{
		boolean esMayor = false;
		
				
			if (this.edad >= mayorEdad) 
			{
				esMayor = true;
				//System.out.println("Es mayor");
			} 
			else 
			{
				esMayor = false;
				//System.out.println("No es mayor de edad");
			}
			return (esMayor);
	}	
	//Esto es para hacer lo de arriba mas rapidamente
	//public boolean esMayorEdad()
	// {
	// return (this.edad > 17);
	//}

//dia 27	
	@Override
	public String toString() 
	{
		String g = new String();
		//
		//g = "La persona con el nombre " + this.nombre + " dentro de 10 años tendrá " + this.edad; 
		g = "La persona con el nombre " + this.nombre + " tiene " + this.edad;
		return g;
		
			//return super.toString();
	}
	
	 public void Medad (int edad)
 	{
 		this.edad=this.edad +edad;	
 				     			     		
 	}

	
}
