package Equipo_05;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		int num = 0;
		
		num = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Cual tabla de multiplicacion"));
		
		MultipliTabla table = new MultipliTabla();
		table.generadordetabla(num, 10);
		
	}

}
