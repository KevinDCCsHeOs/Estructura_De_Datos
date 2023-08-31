package Equipo_06;

public class Registro 
{
	private int nocontrol;
	private String nombre;
	private int edad;
	
	public Registro(int nocontrol, String nombre, int edad)
	{
		this.nocontrol = nocontrol;
		this.nombre = nombre;
		this.edad = edad;
		// Todo Auto-generated contructor stub
	}

	public int getNocontrol() {
		return nocontrol;
	}

	public void setNocontrol(int nocontrol) {
		this.nocontrol = nocontrol;
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
