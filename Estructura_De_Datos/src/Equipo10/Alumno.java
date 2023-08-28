package Equipo10;

public class Alumno {
	
	private String nombre;
	private String numcontrol;
	private byte edad;
	private Materias materias[] = new Materias[8];
	private byte f = 0;

	public Alumno() { }
	
    public Alumno(String nombre, String numcontrol, byte edad) {
        this.nombre = nombre;
        this.numcontrol = numcontrol;
        this.edad = edad;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumcontrol() {
		return numcontrol;
	}

	public void setNumcontrol(String numcontrol) {
		this.numcontrol = numcontrol;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", numero de control=" + numcontrol + ", edad=" + edad + "]\n" ;
	}
	
	public String ImprimeMaterias() {
		String cad = ""; 
		for (byte i = 0; i < 8; i++) {
			if (materias[i] != null) {
				cad += "\n";
				cad += materias[i].toString2();
			}
		}
		return cad;
	}
	
	public void AgregarMateria(Materias materia) {
		if (f < 8) {
	        materias[f] = materia;
	        f++;
	    } else 
	        Tools.salidaError("Lista de materias llena");
	}

}
