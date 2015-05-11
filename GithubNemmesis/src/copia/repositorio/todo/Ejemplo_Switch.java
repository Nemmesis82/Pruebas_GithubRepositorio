package copia.repositorio.todo;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.lang.String;

public class Ejemplo_Switch 
{

	public class SegundaTarea{ 
	
	public void main(String args[] )throws IOException
	{ BufferedReader in =new BufferedReader(new InputStreamReader(System.in)); 

	int n1,n2,sum,div,multi; 
	int op;
	
	System.out.print("Elige una opcion\n" ); 
	System.out.print("1.- realizar una suma\n" ); 
	System.out.print("2.- realizar una divicion\n" ); 
	System.out.print("3.- realizar una multiplicacion\n" ) ; 

	op=Integer.parseInt(in.readLine());

	switch(op)
	{ 
		
	case 1: 
	System.out.print("\nintroduce el primer numero " );
	n1=Integer.parseInt(in.readLine()); 
	System.out.print("\nintroduce el segundo numero " ); 
	n2=Integer.parseInt(in.readLine()); 
	sum=n1+n2; 
	System.out.println("\nla suma es: "+ sum); 
	break; 
	
	case 2: 
	System.out.print("\nintroduce el primer numero" ); 
	n1=Integer.parseInt(in.readLine()); 
	System.out.print("\nintroduce el segundo numero " ); 
	n2=Integer.parseInt(in.readLine());
	div=n1/n2; 
	System.out.println("\nla divicion es: "+ div); 
	break; 
	
	case 3: 
	System.out.print("\nintroduce el primer numero" ); 
	n1=Integer.parseInt(in.readLine());
	System.out.print("\nintroduce el segundo numero " ); 
	n2=Integer.parseInt(in.readLine());
	multi=n1*n2; 
	System.out.print("\nla suma es: "+ multi); 
	break; 
	
	default: 
	System.out.print("\neleccion incorrecta" );

	} 
	} 
	} 

}
