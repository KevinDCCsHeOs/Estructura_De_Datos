package Equipo_10;

public class Pila {
	
	private NodoPila cima;
	public int tama;
	public Pila() {
		cima = null;
		tama = 0;
	}
	
	//Metodo para saber cuando la Pila está vacia
	public boolean estaVacia() {
		return cima == null;
	}
	
	//Metodo para empujar (push) un elemento en la pila
	public void empujar(int elem) {
		NodoPila nuevo = new NodoPila(elem);
		nuevo.siguiente = cima;
		tama++;
	}
	
	//Metodo para sacar (pop) un elemento en la Pila
	public int sacar() {
		int auxiliar = cima.dato;
		cima = cima.siguiente;
		tama--;
		return auxiliar;
	}

}
