package Equipo_10;

import Equipo_10.Tools;

public class Test2 {

	public static void main(String[] args) {
		
		Binario binario = new Binario();
		int a = Tools.leerEntero("Dame el numero a convertir en binario");
		Tools.imprimePantalla( "El numero: " + a + " en binario es = " + binario.binario(a));

	}

}
