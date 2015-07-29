package hibernate.ejemplos.clase.model.services;

import hibernate.ejemplos.clase.model.helper.OperacionesConXML;

public class XMLService {
	private OperacionesConXML opXML = null;
	public XMLService() {
		opXML = new OperacionesConXML();
	}
	public int contarElementos(String url){
		return opXML.contarElementos(url);
	}
}
