package Equipo_08;

import java.util.Scanner;
import java.util.Stack;

public class PilaJava {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Stack pila = new Stack<>();
		int elementos, suma = 0;
		
		System.out.println("¿Cuantos puntajes vas a insertar en la pila?");
		elementos = entrada.nextInt();
		
		for(int i = 0; i < elementos; i++) {
			System.out.println("Insertar el puntaje #" + (i + 1));
			int puntaje = entrada.nextInt();
			pila.push(puntaje);
			suma += puntaje;
		}
		
		System.out.println("El ultimo puntaje en la pila es: " + pila.peek());
		System.out.println("Suma de los puntajes en la pila: " + suma);
		System.out.println("Sacando los puntajes de la pila");
		
		while(!pila.empty()) {
			System.out.println(pila.pop());
		}
		
	}

}
