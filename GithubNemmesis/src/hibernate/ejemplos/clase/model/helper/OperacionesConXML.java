package hibernate.ejemplos.clase.model.helper;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class OperacionesConXML {
	public int contarElementos(String stringUrl) {
		URL url = null;
		int nElementos = 0;
		List<Element> elementos = null;
		// Creamos el parser encargado de interpretar el XML
		SAXBuilder builder = new SAXBuilder();
		// Generamos el arbol DOM del XML utilizando el parser
		Document document = null;
		try {
			url = new URL(stringUrl);
			document = builder.build(url);
			Element elementoRaiz = document.getRootElement();
			elementos = elementoRaiz.getChildren();
			if (elementos.size() > 0) {
				nElementos = elementos.size() + 1;
			}
		} catch (JDOMException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nElementos;
	}
}
