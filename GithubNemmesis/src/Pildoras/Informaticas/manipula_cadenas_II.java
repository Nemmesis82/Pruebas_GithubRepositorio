package Pildoras.Informaticas;

public class manipula_cadenas_II 
{

	public static void main(String[] args) 
	{
		//metodo substring extraer un determinado numero de caracteres 
		//y creamos una subcadena
		
		String frase= "Hoy es un estupendo día para aprender a programar en Java";
		//aprender a programar en Java solo quiero que salga
		
		//begin el comienzo de extraer y endindez caracter que NO queiero extraer
		
		String frase_resumen= frase.substring(0,29) + "irnos a la playa y olvidarnos de todo ....." + " y " +
		frase.substring(29, 57);
		
		System.out.println(frase_resumen);
		
	}

}
