package Equipo_07;

import javax.swing.JOptionPane;

public class FactorialRecursivo {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero para calcular su factorial"));
		if (numero < 0)
			JOptionPane.showMessageDialog(null, "No es posible con un numero negativo");
		else {
			FactorialConObjetos calculadora = new FactorialConObjetos();
			int Factorial = calculadora.CalcularFactorial(numero);
			JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + Factorial);
		}

	}

}
