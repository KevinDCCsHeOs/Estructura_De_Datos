package Equipo_10;

import java.util.Stack;

public class PruebaPilas {
	
	public static void main(String[] args) {
		
		double r = 0;
		Stack<Integer> pila = new Stack<>();
		int tam = Tools.leerEntero("Dame el tamaño de la pila");
		for(int j = 0; j < tam; j++) 
			pila.push(Tools.leerEntero("Dame el numero a ingresar en la pila:"));
		Tools.imprimeSalida("Datos almacenados en la pila: \n" + pila);
		Tools.imprimeSalida("Ahora sacaremos cada uno de los elementos en la pila mientras hacemos algunos calculos");
		r = pila.pop();
		while(!pila.isEmpty()) {
			r = buscarOperacion(r, pila.pop());
		}
		Tools.imprimeSalida("El resultado de todas las operaciones es : " + r);

	}
	
	public static double buscarOperacion(double x, double y) {
		
		Tools.imprimeSalida("Valor 1 = " + x + "     Valor 2 = " + y);
		String sel = Tools.Boton("¿Qué operacion quieres realizar?", "Suma,Resta,Multiplicación,División");
		double r = 0; 
		switch(sel) {
		case "Suma":
			r = x + y;
			break;
		case "Resta":
			r = RestaODivision(x , y , "Resta");
			break;
		case "Multiplicación":
			r = x * y;
			break;
		case "División":
			r = RestaODivision(x , y , "División");
		}
		return r;
		
	}
	
	public static double RestaODivision(double x, double y, String oper) {
		
		double r = 0;
		String sel = Tools.Boton("Escoge el primer numero de la " + oper, "Valor 1 ,Valor 2");
		switch (oper) {
		case "Resta":
			switch (sel) {
			case "Valor 1 ":
				r = x - y;
				break;
			case "Valor 2":
				r = y - x;
				break;
			}
			break;
		case "División":
			switch (sel) {
			case "Valor 1 ":
				r = x / y;
				break;
			case "Valor 2":
				r = y / x;
				break;
			}
			break;
		}
		
		return r;
		
	}
	
}
