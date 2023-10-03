package Equipo_10;

public class Binario {
	
	public String binario(int n) {
		String cad = "";
		if (n > 0) {
			int a = n % 2;
			if (a == 1) {
				n--;
				n /= 2;
			} else 
				n /= 2;
			return binario(n) + a ;
		}
		else 
			return cad;
	}

}
