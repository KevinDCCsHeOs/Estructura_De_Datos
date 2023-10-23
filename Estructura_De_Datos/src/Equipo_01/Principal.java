package Equipo_01;

import java.util.Scanner;
import java.util.Stack;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack<Producto> p = new Stack<>();
		Producto pro;
		System.out.println("Ingrese la cantidad de productos: ");
		int cant = sc.nextInt();
		int k = 0;
		for(int i = 0; i < cant; i++) {
			System.out.println("Ingrese el nombre, codigo y cantidad en stack: " + "Producto" + (k + 1));
			pro = new Producto(sc.next(), sc.nextInt(), sc.nextInt());
			p.push(pro);
			k++;
		}
		System.out.println("Stack menor a 10: ");
		while(!p.isEmpty()) {
			pro = p.pop();
			int stack = pro.getStack();
			if(stack < 10)
				pro.mostrar();
		}

	}

}
