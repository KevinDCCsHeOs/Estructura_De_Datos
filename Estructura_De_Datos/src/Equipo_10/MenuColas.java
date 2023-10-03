package Equipo_10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MenuColas {
	
	public static void main(String[] args) {
		
		Queue<String> cola = new LinkedList();
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		
		do {
			System.out.println("----- Menú de Cola -----");
			System.out.println("1. Verificar si la cola está vacía");
			System.out.println("2. Insertar un elemento en la cola");
			System.out.println("3. Consultar la cola");
			System.out.println("4. Consultar el primer elemento de la cola");
			System.out.println("5. Sacar un elemeto de la cola");
			System.out.println("6. Saber el tamaño de la cola");
			System.out.println("7. Salir");
			System.out.println("Ingresa una opción: ");
			
			
		} while (opcion != 7);
		
	}

}
