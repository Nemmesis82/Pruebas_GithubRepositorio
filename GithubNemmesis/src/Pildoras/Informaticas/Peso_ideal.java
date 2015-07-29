package Pildoras.Informaticas;
import javax.swing.*;
public class Peso_ideal 
{

	public static void main(String[] args) 
	{
		String genero="";
		
		do 
		{
			genero= JOptionPane.showInputDialog("Introduce tu genero (H/M)");
		//Si el genero no es H y si el genero no es M que se repite siempre hasta que se meta H o M	
		}while (genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")== false);

		//Showinput dialog devuelve siempre un String y con el parseInt lo trasformamos en Entero
		int altura= Integer.parseInt(JOptionPane.showInputDialog("introduce altura en cm"));
		
		int peso_ideal=0;
		
		if (genero.equalsIgnoreCase("H"))
		{
			peso_ideal=altura-110;
		}
		else if(genero.equalsIgnoreCase("M"))
		{
			peso_ideal=altura-120;
		}
		
		System.out.println("El peso ideal es " + peso_ideal+ ", kg.");
		
	}

}
