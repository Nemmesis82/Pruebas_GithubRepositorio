package hibernate.ejemplos.clase.model.helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class OperacionesConXMLLocal {
	public int contarElementos(String url) {
		int nElementos = 0;
		// Creamos el parser encargado de interpretar el XML
		SAXBuilder builder = new SAXBuilder();
		// Generamos el arbol DOM del XML utilizando el parser
		Document document;
		try {
			document = builder.build(new FileInputStream(url));
			Element elementoRaiz = document.getRootElement();
			// Cargo los libros obteniendo el valor y los atributos de cada
			// elemento
			// de cada libro
			List<Element> elementos = elementoRaiz.getChildren();
			for (Element element : elementos) {
				nElementos++;
			}
		} catch (JDOMException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nElementos;
	}
}
