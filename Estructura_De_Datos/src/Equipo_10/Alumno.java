package Equipo_10;

import java.util.Vector;

import Equipo_10.Materias;
import Equipo_10.Tools;

public class Alumno {
	
	private String nombre;
	private String numcontrol;
	private byte edad;
	private Vector<Materias> materias = new Vector<>(8);
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
			if (materias.get(i) != null) {
				cad += "\n" + materias.get(i).toString2() + "\n";
			}
		}
		return cad;
	}
	
	public void AgregarMateria(Materias materia) {
		if (f < 8) {
	        materias.add(f, materia);
	        f++;
	    } else 
	        Tools.salidaError("Lista de materias llena");
	}

}
