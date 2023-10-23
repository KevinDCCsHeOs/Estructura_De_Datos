package SinSaberEquipo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ProgramaColas {

	public static void main(String[] args) {
		
		Queue<String> cola = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el primer elemento: ");
		String elemento1 = scanner.nextLine();
		cola.offer(elemento1);
		
		System.out.println("Ingresa el segundo elemento: ");
		String elemento2 = scanner.nextLine();
		cola.offer(elemento2);
		
		System.out.println("Ingresa el tercer elemento: ");
		String elemento3 = scanner.nextLine();
		cola.offer(elemento3);
		
		scanner.close();
		System.out.println("Cola: " + cola);
		
		String elemento = cola.poll();
		System.out.println("Elemento obtenido y eliminado: " + elemento);
		System.out.println("Cola despues de la eliminacion: " + cola);
		String primerElemento = cola.peek();
		System.out.println("Primer elemento sin eliminar: " + primerElemento);

	}

}
