package Equipo_06;

import javax.swing.JOptionPane;

public class ControlEscolar 
{
	public static void main(String[] args) 
	{
		int nocontrol;
		String nombre;
		int edad;
		Boleta proceso = new Boleta();
		nocontrol = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de control"));
		nombre = JOptionPane.showInputDialog("Dame el nombre");
		edad = Integer.parseInt(JOptionPane.showInputDialog("Dame la edad"));
		
		Registro alumno = new Registro(nocontrol,nombre,edad);
		
		proceso.setMateria(JOptionPane.showInputDialog("Dame la primer materia "));
		proceso.setCalif(Integer.parseInt(JOptionPane.showInputDialog("Dame la calificacion de la materia")));
		proceso.setMateria2(JOptionPane.showInputDialog("Dame la segunda materia"));
		proceso.setCalif2(Integer.parseInt(JOptionPane.showInputDialog("Dame la calificacion de la segunda materia")));
		System.out.print("             B O L E T A");
		System.out.print("\n    No de control "+alumno.getNocontrol());
		System.out.print("\n    Nombre "+alumno.getNombre());
		System.out.print("\n    Edad "+alumno.getEdad());
		System.out.print("\n    Materias          Calificaciones");
		System.out.print("\n    "+proceso.getMateria()+"          "+proceso.getCalif());
		System.out.print("\n    "+proceso.getMateria2()+"          "+proceso.getCalif2());
		System.out.print("                                             Promedio:"+proceso.promedio());
	}
}
