package Equipo_01;

public class Producto {
	
	private String nombre;
	private int codigo, stack;
	
	public Producto(String nom, int cod, int a) {
		nombre = nom;
		codigo = cod;
		stack = a;
	}
	
	public int getStack() {
		return stack;
	}
	
	public void mostrar() {
		System.out.println("Nombre: " + nombre + "\n Codigo: " + codigo + "\n Stack: " + stack);
	}

}
