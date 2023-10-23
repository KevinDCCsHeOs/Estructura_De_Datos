package Equipo_03;

import java.util.Stack;

public class Palidromo {
	
	public static boolean esPalindromo(String cadena) {
		
		Stack<Character> pila = new Stack<>();
		
		for(int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			pila.push(caracter);
		}
		
		String cadenaInvertida = "";
		while(!pila.isEmpty()) {
			cadenaInvertida += pila.pop();
		}
		
		return cadena.equals(cadenaInvertida);
		
	}
	
	public static void main(String[] args) {
		
		String cadena = "radar";
		
		if(esPalindromo(cadena)) {
			System.out.println("'" + cadena + "' es un palindromo.");
		} else {
			System.out.println("'" + cadena + "' no es un palindromo.");
		}
		
	}

}
