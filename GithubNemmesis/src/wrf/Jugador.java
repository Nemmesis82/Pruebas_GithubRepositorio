package wrf;

public class Jugador 
{
	private String nombre;
	private int edad;
	
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public Jugador() 
	{
	}
	
	public Jugador(String nom, int age) 
	{
		this.nombre=nom;
		this.edad=age;
	}

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

	
}
