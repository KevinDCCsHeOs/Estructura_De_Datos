package SinSaberEquipo;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros desea ingresar?"));
		int arreglo[] = new int[numero];
		
		if (arreglo.length == 0 )
			JOptionPane.showMessageDialog(null, "No se puede recorrer un arreglo con este numero de posiciones");
		else {
			ArregloRecursivo objArreglo = new ArregloRecursivo();
			arreglo = objArreglo.llenarArreglo(arreglo, 0);
			objArreglo.leerArreglo(arreglo, 0);
		}
	}

}
