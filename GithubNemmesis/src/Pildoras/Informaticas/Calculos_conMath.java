package Pildoras.Informaticas;

public class Calculos_conMath 
{

	public static void main(String[] args) 
	{
		// hacer raiz cuadrada
		
		//double raiz= Math.sqrt(9);//hacer la raiz cuadrada de 9 siempre devuelve un double por eso
		//devuelve 3.0
		
		//double num1=5.85;
		//long resultado = Math.round(num1);
		//System.out.println(resultado);
		/*--------------*/
		//float num1=5.85F;
		//int resultado = Math.round(num1);
		//System.out.println(resultado);
		/*-----------------------------*/
		//double num1=5.85;
		//int resultado = (int)Math.round(num1); 
        // Refundicion consiste en poner el tipo de dato entre parentesis y 
		// lo convertimos al tipo de dato al que queremos
		//System.out.println(resultado);
		/*-----------------*/
		
		//metodo pow potencias
		double base = 5 ;
		double exponente =3 ;
		int resultado = (int)Math.pow(base, exponente);
		//double resultado = Math.pow(base, exponente);
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);
		
	}

}
