package Equipo_06;

import javax.swing.JOptionPane;

public class NumPrimo {

	public static void main(String[] args) {
		
		int NUM;
		NUM = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el NUMERO"));
		if(numeroPrimo(NUM, 2))
			JOptionPane.showMessageDialog(null, "El numero : " + NUM + ", Es Primo");
		else 
			JOptionPane.showMessageDialog(null, "El numero : " + NUM + ", NO es Primo");

	}
	
	public static boolean numeroPrimo(int NUMERO, int r) {
		if(NUMERO % r == 0)
			return false;
		else if(r > NUMERO/2)
			return true;
		else 
			return numeroPrimo(NUMERO, r + 1);
	}

}
