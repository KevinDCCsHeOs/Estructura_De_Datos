package Equipo_10;

import java.util.Scanner;
import java.util.Stack;

public class Pilas {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Stack pila = new Stack();
		int i, elementos;
		
		System.out.println("Cuantos alumnos vas a insertar en la pila");
		elementos = entrada.nextInt();
		for (i = 0; i<elementos;i++) {
			System.out.println("Inserta el nombre del alumno " + (i+1));
			pila.push(entrada.next());
			System.out.println("Inserta la calificacion de " + pila.peek());
			pila.push(entrada.nextInt());
		}
		System.out.println("El ultimo elemento en la pila es " + pila.peek());
		System.out.println("Sacando los elementos de la pila");
		while(pila.empty() == false) {
			System.out.println(pila.pop());
		}
		
	}

}
