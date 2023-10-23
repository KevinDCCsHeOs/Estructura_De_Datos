package Equipo_01;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class Colita {
	
	public static void main(String[] args) {
		
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos articulos desea comprar"));
		Queue<String> carrito = new LinkedList<>();
		Queue<Integer> cash = new LinkedList<>();
		
		for(int i = 0; i < cantidad; i++) {
			String carritoDeCompra = JOptionPane.showInputDialog("Que articulo desea agregar");
			carrito.add(carritoDeCompra);
			int cant = Integer.parseInt(JOptionPane.showInputDialog("¿Que cantidad va a comprar?"));
			cash.add(cant);
		}
		JOptionPane.showMessageDialog(null, "Articulos en el carrito: " + carrito + 
				"\n Cantidad de articulos: " + cash);
		
		int k = 0;
		while(!carrito.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Comprando articulo " + (k+1) + 
					": \n Nombre: " + carrito.peek()
					+ " \n Cantidad: " + cash.peek());
			carrito.poll();
			cash.remove();
			k++;
		}
	}

}
