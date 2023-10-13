package Equipo_10;

public class Listas {
	
	protected Nodo inicio,primero;
	public Listas() {
		inicio = null;
		primero = null;
	}
	
	public boolean estaVacia() {
		return (inicio==null);
	}
	
	public void agregarAlInicio(String nom, int edad) {
		inicio = new Nodo(nom, edad, inicio);
		if(primero == null)
			primero = inicio;
	}

	public void agregarAlFinal(String nom, int edad) {
		if(!estaVacia()) {
			primero.siguiente = new Nodo(nom, edad, null);
			primero=primero.siguiente;
		}else {
			inicio = primero = new Nodo(nom , edad , null);
		}
	}
	
	public void mostrarLista() {
		Nodo recorrer = inicio;
		while(recorrer != null) {
			recorrer=recorrer.siguiente;
			System.out.print("[nombre:" + recorrer.nombre + "  edad:" + recorrer.edad + "]=====> ");
			if(recorrer == null)
				System.out.print("null");
		}
	}
	
	public void eliminarDelInicio() {
		System.out.println("Alumno eliminado: " + "[nombre:" + inicio.nombre + " edad:" + inicio.edad + "]");
		if(inicio==primero) 
			inicio = primero = null;
		else 
			inicio = inicio.siguiente;
	}
	
	public void eliminarDelFinal() {
		System.out.println("Alumno eliminado: " + "[nombre:" + primero.nombre + " edad:" + primero.edad + "]");
		if(inicio==primero)
			inicio=primero=null;
		else {
			Nodo temporal = inicio;
			while(temporal.siguiente != primero) {
				temporal = temporal.siguiente;
			}
			primero = temporal;
			primero.siguiente = null;
		}
	}
	
	public void eliminarAlumnoEspecifico(String alumno) {
		if(!estaVacia()) {
			if(inicio == primero && inicio.nombre.equalsIgnoreCase(alumno)) {
				inicio=primero=null;
			}else if(inicio.nombre.equalsIgnoreCase(alumno)) {
				inicio = inicio.siguiente;
			}else {
				Nodo anterior, temporal;
				anterior = inicio;
				temporal = inicio.siguiente;
				while(temporal != null && !temporal.nombre.equalsIgnoreCase(alumno)) {
					anterior = anterior.siguiente;
					temporal= temporal.siguiente;
				}
				if(temporal != null) {
					anterior.siguiente = temporal.siguiente;
					if(temporal==primero) {
						primero=anterior;
					}
				}
			}
		}
	}
	
	public boolean buscarAlumno(String nombre) {
		Nodo temporal = inicio;
		while(temporal != null && !temporal.nombre.equalsIgnoreCase(nombre)) {
			temporal= temporal.siguiente;
		}
		return temporal != null;
	}
	
	public void buscarAlumno2(String nombreAlu) {
		Nodo temporal = inicio;
		boolean ver = false;
		int nodo = 1;
		while(temporal != null) {
			if(temporal.nombre.equalsIgnoreCase(nombreAlu)) {
				ver = true;
				break;
			}
			temporal= temporal.siguiente;
			nodo++;
		}
		if (ver)
			System.out.println("El alumno " + nombreAlu + " se encuentra en la posicion numero " + nodo);
		else 
			System.out.println("No se encontro el alumno");
	}
	
	
	
}
