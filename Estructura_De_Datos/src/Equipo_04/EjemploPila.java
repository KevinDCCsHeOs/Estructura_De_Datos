package Equipo_04;

import java.util.Scanner;
import java.util.Stack;

public class EjemploPila {

	public static void main(String[] args) {
		
		Stack<Integer> pila = new Stack<>();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Opciones:");
			System.out.println("1. Agregar elemento a la pila");
			System.out.println("2. Eliminar elemento de la pila");
			System.out.println("3. Mostrar la pila");
			System.out.println("4. Salir");
			int opcion = scanner.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Ingrese un numero para agregar a la pila: ");
				int elemento = scanner.nextInt();
				pila.push(elemento);
				break;
			case 2:
				if(!pila.isEmpty()) {
					int elementoEliminado = pila.pop();
					System.out.println("Elemento eliminado de la pila: " + elementoEliminado);
				} else {
					System.out.println("La pila esta vacia.");
				}
				break;
			case 3:
				System.out.println("Contenido de la pila: " + pila);
				break;
			case 4:
				System.out.println("Saliendo del programa.");
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("Opcion no valida");
			}
		}

	}

}
