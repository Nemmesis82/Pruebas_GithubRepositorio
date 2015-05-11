package copia.repositorio.todo;

public class Arrays {

	public static void main(String[] args) 
	{
	
	// defición de un array
		//int[] array_de_enteros = new int[10];	
		
		int[] array_de_enteros;
		
		array_de_enteros = new int[10];
		
		//otra opcion para declarar e inicializar
		
		int [] array={10,15,20};
// tb puede ser int i=0; i<array.length;i++
		
		int aux= 0;
		
		for (int i=0; i<3;i++)
		{
		//	System.out.println(array[i]);
			aux = array[i];
			System.out.println(aux);
		}

	}

}
