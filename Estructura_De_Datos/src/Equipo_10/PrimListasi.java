package Equipo_10;

import javax.swing.JOptionPane;

public class PrimListasi {

	public static void main(String[] args) {
		
		Listas listaSimple = new Listas();
		int opcion = 0;
		int edad = 0;
		String alumno = "";
		do {
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1. agregar alumno al inicio de la lista\n"
						+ "2. Agregar alumno al final de la lista\n"
						+ "3. Mostrar los datos de la lista de inicio a fin \n"
						+ "4. Eliminar alumno del inicio\n"
						+ "5. Eliminar alumno del final\n"
						+ "6. Eliminar un elemento en especifico\n"
						+ "7. Buscar alumno por nombre\n"
						+ "8. Salir","Menu de opciones",JOptionPane.INFORMATION_MESSAGE));
				switch(opcion) {
				case 1:
					try {
						alumno = JOptionPane.showInputDialog(null,"Ingresa el nombre","Insertado al inicio",JOptionPane.PLAIN_MESSAGE);
						edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad","Insertado al inicio",JOptionPane.PLAIN_MESSAGE));
						listaSimple.agregarAlInicio(alumno, edad);
					}catch(NumberFormatException n) {
						JOptionPane.showMessageDialog(null,"Error"+n.getMessage());
					}
					break;
				case 2:
					try {
						alumno = JOptionPane.showInputDialog(null,"Ingresa el nombre","Insertado al final",JOptionPane.PLAIN_MESSAGE);
						edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad","Insertado al final",JOptionPane.PLAIN_MESSAGE));
						listaSimple.agregarAlFinal(alumno, edad);
					}catch(NumberFormatException n) {
						JOptionPane.showMessageDialog(null,"Error"+n.getMessage());
					}
					break;
				case 3:
					listaSimple.mostrarLista();
					break;
				case 4:
					if(!listaSimple.estaVacia()) {
						listaSimple.eliminarDelInicio();
					}else {
						JOptionPane.showMessageDialog(null, "No se puede eliminar, puesto que no hay alumnos capturados");
					}
					break;
				case 5:
					if(!listaSimple.estaVacia()) {
						listaSimple.eliminarDelFinal();
					}else {
						JOptionPane.showMessageDialog(null, "No se puede eliminar, puesto que no hay alumnos capturados");
					}
					break;
				case 6:
					alumno = JOptionPane.showInputDialog("Ingresa el nombre del alumno a eliminar");
					listaSimple.eliminarAlumnoEspecifico(alumno);
					JOptionPane.showMessageDialog(null, "El elemento eliminado es " + alumno);
					break;
				case 7:
					if(!listaSimple.estaVacia()) {
						listaSimple.buscarAlumno2(JOptionPane.showInputDialog("Dame el nombre del alumno a buscar","Buscar alumno"));
					}else {
						JOptionPane.showMessageDialog(null, "No se puede buscar un alumno, puesto que no hay alumnos capturados");
					}
					break;
				case 8:
					JOptionPane.showMessageDialog(null,"Aplicacion finalizada","hasta la vista",JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
		            JOptionPane.showMessageDialog(null,"Opcion inconrrecta");
				}
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
			}
		}while(opcion != 8);

	}

}
