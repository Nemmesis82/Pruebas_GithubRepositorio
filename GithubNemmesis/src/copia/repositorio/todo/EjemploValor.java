package copia.repositorio.todo;
//paso de referencia por valor
public class EjemploValor 
{

	public static void porValor (int a)
	{
		a=a+7;//aqui el valor de la a seria 12 a=5+7
		//pero solo en local porValor

	}
	
	
	public static void main(String[] args) 
	{
	
		int a=5;
		//variable a del main, variable local no tiene nada que ver con la a deporValor
		porValor(a);
		System.out.println(a);

	}
		
}
