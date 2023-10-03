package Equipo_02;

public class Ejercicio {
	
	private static int numero = 3;
	
	public static void main(String[] args) {
		resta(numero);
	}
	
	public static void resta(int n) {
		System.out.println(n);
		if(n > 1)
			resta(n - 1);
		else
			suma(n + 1);
	}
	
	public static void suma(int n) {
		System.out.println(n);
		if(n < numero)
			suma(n + 1);
	}

}
