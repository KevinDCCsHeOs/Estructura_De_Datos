package Equipo_07;

import java.util.Stack;

import javax.swing.JOptionPane;

public class PilaU3 {

	public static void main(String[] args) {
		
		String oracionInvertida = invertirPalabras(JOptionPane.showInputDialog("Ingrese una oracion"));
		JOptionPane.showMessageDialog(null, "Oracion invertida: " + oracionInvertida);

	}
	
	public static String invertirPalabras(String oracion) {
		
		String[] palabras = oracion.split(" ");
		
		String n = " ";
		
		Stack<String> pila = new Stack<>();
		for(String palabra : palabras) {
			pila.push(palabra);
		}
		
		while(!pila.isEmpty()) {
			n += pila.pop() + " ";
		}
		
		return n;
		
	}

}
