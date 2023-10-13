package Equipo_10;

public class Nodo {
	
	public String nombre;
	public int edad;
	public Nodo siguiente;
	
	public Nodo(String nom, int ed, Nodo n) {
		this.nombre = nom;
		this.edad = ed;
		this.siguiente = n;
	}

}
