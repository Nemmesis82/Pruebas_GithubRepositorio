package copia.repositorio.todo;

import java.util.Scanner; 

// esto se ha puesto solo al poner scanner sc

/*en este caso no me salia paquete por lo que me ha dado error me ha ofrecido añadirlo al nuevo paquete*/

public class QueHace 
{

	int a;// por estar declarada aquí, fuera de cualquier método; a es un
			// atributo de la clase. Por lo tanto, es accesible y visible desde
			// todos los métodos de la clase

	static int b = 50; // una variable que sea estatica nueva

		void metodo() 
	{
		System.out.println(a);
		a++; // equivalente --> a = a + 1;
		// System.out.println(b);
	}
		
		// ESTO SE LLAMA SOBRECARGA, es bastante util para definir el mismo metodo de distintas formas

		// este es el método contructor que es el QueHace(), 
		
		public QueHace()
		{
					
		}
		

		// este es el método contrusctor modificado 
		
		public QueHace(int valor)
		{
			a = valor; 
					
		}

// de manera que si hacemos una llamada puede ir al metodo contructor predefinido o al metodo modificado por nosotros que es QueHaces(int valor)		
		
	
	public static void main(String[] args) 
	{
	
		QueHace qh1 = null; //declaro qh1

		QueHace qh2 = null; // declaro qh2

		qh1 = new QueHace(); // inicializo qh1

		qh1.metodo();

		qh1.metodo();

		qh1.a = 33; // le asigno a el valor 33

		qh1.metodo();

		System.out.println(qh1.a); // muestra el valor de qh1.a en consola

		qh2 = new QueHace(); // hemos inicializado qh2

		qh2.metodo(); // hacemos que entre en la variable de metodo

		//System.out.println("desde qh1 = " + qh1.b); // muestro el valor de qh1.b

		//qh1.b++; // incremento b ++

		//System.out.println("desde qh2 = " + qh2.b); // muestro el valor de qh2.b y esta incrementada

		System.out.println(QueHace.b); // hemos sacado por pantalla el objeto por eso no me sale error como en las dos anteriores si sale el error .
		
		String nombre; // creo la variable nombre para hacer el ejercicio de que me lo pida por teclado.
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca nombre: "); // con esto en la consola nos pide que introduzcamos un nombre.
		
		nombre = sc.next(); // Aqui se qda a la espera de que introduzcamos el nombre
		
		System.out.println(nombre); // Aqui se muestra el nombre que hemos introducido anteriormente.
		
		sc.close();// esto se hace para cerrar el scanner que no se quede esperando a q introduzca mas cosas.
	
	//aqui es donde ponemos los nuevos parametros para ver si los dos metodos creados funcionana correctamente
		
		QueHace qh7=null; //Declaro qh7
		
		qh7= new QueHace(); // inicializo el valor qh7 al metodo QueHace()
		
		System.out.println(qh7.b); // Lo muestro por pantalla
		
		qh7= new QueHace(7); // inicializo el valor qh7 al metodo QueHace(int valor)
		
		System.out.println(qh7.b); // Lo muestro por pantalla 

	}

}
