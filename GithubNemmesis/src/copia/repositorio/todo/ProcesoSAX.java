package copia.repositorio.todo;

import java.io.FileInputStream;
import java.io.IOException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class ProcesoSAX 
{

	public static void main(String[] args) 
	{
	        
	      try 
	      {  
	         
	    	  //creo el hasmap
	    	  
	    	  // Creamos nuestro objeto libro vacío  
	         Libro libro = new Libro();  
	         // Creamos la factoria de parseadores por defecto  
	         XMLReader reader = XMLReaderFactory.createXMLReader();  
	         
	         LibroXML libroXML = new LibroXML(libro);
	         // Añadimos nuestro manejador al reader pasandole el objeto libro  
	         reader.setContentHandler(libroXML);           
	         // Procesamos el xml de ejemplo  
	         reader.parse(new InputSource(new FileInputStream("c:\\Users\\alumno\\Desktop\\clases Ruth 703\\Mayo\\Clase22\\libros.xml")));  
	         
	         
	         System.out.println(libroXML.libros_N);           
	      }
	      catch (SAXException e) 
	      {  
	         e.printStackTrace();  
	      }
	      catch (IOException e) 
	      {
	    	 e.printStackTrace();  
	      }  
	  
	   }  
}