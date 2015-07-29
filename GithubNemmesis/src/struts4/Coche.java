package struts4;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;

@SuppressWarnings("serial")
public class Coche 
{
	String marca;
	String modelo;
	
	Coche co=null;
	
	public Coche getCo() {
		return co;
	}
	@TypeConversion(converter="struts4.cocheAction")
	public void setCo(Coche co) {
		this.co = co;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Coche(String marca, String modelo) 
	{
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
	
	
}
