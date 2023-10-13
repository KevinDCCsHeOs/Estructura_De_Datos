package Equipo_10;

public class CadenaConNumero {
	
	public static void main(String[] args) {
		
		String a = (VerificarSiContieneNumeros(Tools.leerString("Dame la cadena: "), 0))? "Si contiene numeros" : "La cadena no contiene numeros";
		Tools.imprimeSalida(a);
		
	}
	
	public static boolean VerificarSiContieneNumeros(String cad, int num) {
		
		boolean v = false;
		if(num >= cad.length())
			v = false;
		else if(Character.isDigit(cad.charAt(num))) 
			v = true;
		else 
			v = VerificarSiContieneNumeros(cad, num + 1);
		
		return v;
		
	}

}
