package SinSaberEquipo;

import javax.swing.JOptionPane;

public class ArregloRecursivo {
	
	public int [] llenarArreglo(int [] arr, int n) {
		if (n == arr.length)
			return arr;
		else {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
			arr[n] = numero;
			return llenarArreglo(arr, n+1);
		}
	}
	
	public void leerArreglo(int[] arr, int n) {
		if(n < arr.length) {
			System.out.println("Posicion: " + (n+1) + " valor: " + arr[n]);
			leerArreglo(arr, n+1);
		}
	}

}
