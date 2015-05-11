package copia.repositorio.todo;

public class Ejemplo_array 
{
	public static void main(String[] args) 
	{
		String palabraMasGrande = null;
		
		int palabraMasGrandeS = 0;	//contendra la suma total de los 
		int maxPalGran = palabraMasGrandeS;
		int ini=-1;
		
		for (int i=0; i<args.length;i++)
		{
			//en palabra mas grande almaceno el contenido de args[i] 
			palabraMasGrande = args[i] ;
			
			//System.out.println(palabraMasGrande);
			
				//Ahora recorro en int de palabraMasGrande con la
			
			maxPalGran = Math.max(args[i].length(), palabraMasGrandeS);
			
			//System.out.println(args[i]+ "  " + args[i].length());
			
			String maxP= new String();
			
											
			
			//System.out.println(args[i].length());
			
			//System.out.println(maxPalGran);

		    	if (palabraMasGrandeS !=  maxPalGran)ini=1; 
		    	{
		    		
		    	   		maxPalGran = palabraMasGrandeS;
		       	}
		    				
			
			
		 }
		
		System.out.println(palabraMasGrande);
		

	}

}
