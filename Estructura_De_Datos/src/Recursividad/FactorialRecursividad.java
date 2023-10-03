package Recursividad;

import java.util.Scanner;

public class FactorialRecursividad {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese un número para calcular su factorial: ");
		int numero = scanner.nextInt();
		if (numero < 0)
			System.out.println("No se puede calcular el factorrial de un número negativo.");
		else {
			FactorialConObjetos calculadora = new FactorialConObjetos();
			int factorial = calculadora.calcularFactorial(numero);
			System.out.println("El facorial de " + numero + " es: " + factorial);
		}
		scanner.close();	
	}

}
