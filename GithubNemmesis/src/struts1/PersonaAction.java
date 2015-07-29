package struts1;

import com.opensymphony.xwork2.ActionSupport;

public class PersonaAction extends ActionSupport 
{
	Persona p2;
	String nombre;
	int edad;
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String execute() throws Exception 
	{
		System.out.println(nombre);	
		System.out.println(edad);
		return SUCCESS;

	}

}
