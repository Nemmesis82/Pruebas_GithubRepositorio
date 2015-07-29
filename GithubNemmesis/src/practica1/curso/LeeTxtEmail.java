package practica1.curso;
public class LeeTxtEmail
{

	public static void main(String[] args) 
	{
		// esto es estatico
		//
		Runtime runtime = Runtime.getRuntime();
		long mem_ini, mem_fini, total;
		
		
		///runtime.freeMemory(); para saber espacio libre de memoria
		//System.out.println("Inicio: "+ runtime.freeMemory());
		System.out.println("Memoria Total de la JVM: " +runtime.totalMemory());
		//Memoria libre
		System.out.println("Memoria Antes: " + runtime.freeMemory());
		mem_ini = runtime.freeMemory();
		
		// esto es para medir el tiempo que tarda en ejecutarla inicio
		long timeIni=System.currentTimeMillis();
		String [] leido=null;
		String leer = "c:\\Users\\alumno\\Desktop\\clases Ruth 703\\Mayo\\Clase07\\fichero.txt";
		leido = Leer_Txt.ficTxt(leer);
		
		//Memoria libre	
		 System.out.println("Memoria Despues: " + runtime.freeMemory()); 
	     runtime.gc();
	     System.out.println("Despues del Garbage Collector: " + runtime.freeMemory());
	     mem_fini = runtime.freeMemory();
	     total= mem_fini-mem_ini;
	     System.out.println(total);
		
		//esto es para medir el tiempo que tarda en ejecutarla final
		long timeFini=System.currentTimeMillis();
		//System.out.println(timeIni);
		//System.out.println(timeFini);
		//diferencia del tiempo inicio y tiempo final
		System.out.print("Saber tiempo que tarda en ejecutarse el programa:");
		System.out.println(timeFini-timeIni);

	}

}
