package Equipo_10;

import java.util.LinkedList;
import java.util.Queue;

public class ColaSupermercado {

	public static void main(String[] args) {
		
		Queue<String> cola = new LinkedList();
		String sel= "";
		
		do {
			sel = Tools.Desplegable("Menú colas","Agregar nuevo cliente a la cola,Ver tamaño de la cola,Ver clientes en cola,"
					+ "Ver el primer cliente a atender,Ver si cola esta vacia,Atender cliente,Salir");
			
			switch(sel) {
			case "Agregar nuevo cliente a la cola":
				cola.offer(Tools.leerString("Nombre del cliente"));
				break;
			
			case "Ver tamaño de la cola":
				Tools.imprimeSalida("El tamaño de la cola es = " + cola.size());
				break;
				
			case "Ver clientes en cola":
				if (cola.isEmpty())
					Tools.imprimeSalida("La cola esta vacia, agrega algun ciente al cual se le pueda atender.");
				else
					Tools.imprimeSalida("Los clientes en la cola son: \n" + cola);
				break;
				
			case "Ver el primer cliente a atender":
				if (cola.isEmpty())
					Tools.imprimeSalida("La cola esta vacia, agrega algun ciente al cual se le pueda atender.");
				else
					Tools.imprimeSalida("El primer cliente en la cola es: " + cola.peek());
				break;
				
			case "Ver si cola esta vacia":
				String mensaje = (cola.isEmpty())? "La cola esta vacia" : "La cola contiene clientes";
				Tools.imprimeSalida(mensaje);
				break;
				
			case "Atender cliente":
				if (cola.isEmpty())
					Tools.imprimeSalida("La cola esta vacia, agrega algun ciente al cual se le pueda atender.");
				else
					Tools.imprimeSalida("Cliente atendido: " + cola.poll());
				break;
				
			case "Salir":
				Tools.imprimeSalida("Saliendo del programa...");
				break;
				
			}
		}while(!sel.equalsIgnoreCase("Salir"));

	}

}
