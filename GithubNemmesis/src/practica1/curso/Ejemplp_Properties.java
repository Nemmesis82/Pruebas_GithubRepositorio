package practica1.curso;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Ejemplp_Properties 
{
	  
	public void seleccionIdioma(String oma) throws FileNotFoundException
	{
		//toUpperCase para pasar de minusculas a Mayusculas
		oma = oma.toUpperCase();
		Properties idioma = new Properties();
		FileInputStream fis = null;
		File fil = null;
		FileWriter fw = null;
		
		 switch(oma)
		 {
         case "ES":
        
        	 try 
        	 {
        		 fis= new FileInputStream("src/practica1/curso/story_es.properties");
        		//cargamos las propiedades
        		 idioma.load(fis);
        		 idioma.getProperty("outfile");
        		 idioma.getProperty("start");
        		 idioma.getProperty("body");
        		 idioma.getProperty("end");
        		 
        		 //	Aqui escribo en el fichero
        		 
        		 fil = new File(idioma.getProperty("outfile"));
        		 fil.createNewFile();
        		 fw = new FileWriter(fil);
        		 fw.write(idioma.getProperty("start")+"\n");
        		 fw.write(idioma.getProperty("body")+"\n");
        		 fw.write(idioma.getProperty("end")+"\n");
        		 fw.close();
        		 
        	 } 
        	 catch (IOException e) 
        	 {
				// TODO Auto-generated catch block
				e.printStackTrace();
        	 }
        	 
         	
           break;
           
         case "IT":
        	 try 
        	 {
        		 fis= new FileInputStream("src/practica1/curso/story_it.properties");
        		//cargamos las propiedades
        		 idioma.load(fis);
        		 
        		 idioma.getProperty("outfile");
        		 idioma.getProperty("start");
        		 idioma.getProperty("body");
        		 idioma.getProperty("end");

        		 //Aqui escribo en el fichero
        		 
        		 fil = new File(idioma.getProperty("outfile"));
        		 fil.createNewFile();
        		 fw = new FileWriter(fil);
        	 } 
        	 catch (IOException e) 
        	 {
				// TODO Auto-generated catch block
				e.printStackTrace();
        	 }
        	 
                 break;
         case "EN":
        	 
        	 try 
        	 {
        		 fis= new FileInputStream("src/practica1/curso/story_en.properties");
        		//cargamos las propiedades
        		 idioma.load(fis);
        		 idioma.getProperty("outfile");
        		 idioma.getProperty("start");
        		 idioma.getProperty("body");
        		 idioma.getProperty("end");
        		 //	Aqui escribo en el fichero
        		 
        		 fil = new File(idioma.getProperty("outfile"));
        		 fil.createNewFile();
        		 fw = new FileWriter(fil);
        	 } 
        	 catch (IOException e) 
        	 {
				// TODO Auto-generated catch block
				e.printStackTrace();
        	 }	 
             break;
         default:
                 
		 }
		
	}
	public static void main(String[] args)throws FileNotFoundException 
	{ 
		
			String idi = args[0];	
						
			
	}
}
