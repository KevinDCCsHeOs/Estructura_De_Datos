package Recursividad;

public class FactorialConObjetos {
	
	public int calcularFactorial (int n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return n * calcularFactorial(n - 1);
	}

}
