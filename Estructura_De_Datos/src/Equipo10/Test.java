package Equipo10;

import Equipo10.*;

public class Test {

	public static void main(String[] args) {
		CapturaDatos();
	}
	
	public static void CapturaDatos() {
		
		String sel = "";
		int tamAlu = Tools.leerEntero("Dame el numero de alumnos a crear: "), incAlu = 0;
		int tamDoc = Tools.leerEntero("Dame el numero de docentes a crear: "), incDoc = 0;
		int tamMat = Tools.leerEntero("Dame el numero de materias a crear: "), incMat = 0;
		Alumno alumnos[] = new Alumno[tamAlu];
		Docente docentes[] = new Docente[tamDoc];
		Materias materias[] = new Materias[tamMat];
		
		do {
			sel = Tools.Desplegable("¿Qué accion quieres realizar?",
					"Crear Alumno,Crear Docente,Crear Materia,Buscar informacion del Alumno,Asignar Docente a materia,Asignar materia a alumno,Salir");
			switch(sel) {
			case "Crear Alumno":
				if (incAlu < tamAlu) {
					alumnos[incAlu] = new Alumno(Tools.leerString("Dame el nombre del Alumno: "),
							Tools.leerString("Dame el numero de control del Alumno: "),
							Tools.leerByte("Dame la edad del Alumno: "));
					incAlu++;
				} else 
					Tools.salidaError("Lista de alumnos llena");
				break;
			case "Crear Docente":
				if (incDoc < tamDoc) {
					docentes[incDoc] = new Docente(Tools.leerString("Dame el numero de control del Docente : "),
							Tools.leerString("Dame el nombre del Docente: "));
					incDoc++;
				} else 
					Tools.salidaError("Lista de alumnos llena");
				break;
			case "Crear Materia":
				if (incMat < tamMat) {
					materias[incMat] = new Materias(Tools.leerString("Dame el codigo de la Materia : "),
							Tools.leerString("Dame el nombre de la Materia: "));
					incMat++;
				} else 
					Tools.salidaError("Lista de materias llena");
				break;
			case "Buscar informacion del Alumno":
				Tools.imprimeSalida("Alumnos registrados\n" + imprimeDatosAlumnos( tamAlu , alumnos ));
				Tools.imprimePantalla(buscarAlumno(tamAlu, alumnos, Tools.leerString("Nombre o numero de control a buscar: ")));
				break;
			case "Asignar Docente a materia":
				if (incMat == 0 || incDoc == 0)
					Tools.salidaError("No hay materias/Docentes aun registrados");
				else {
					Tools.imprimeSalida("Docentes Disponibles\n" + imprimeDatosDocentes(tamDoc, docentes) +
			                "\nMaterias Disponibles\n" + imprimeMaterias(tamMat, materias));
					byte m = Tools.leerByte("Escoge un número del registro de materias");
			        byte d = Tools.leerByte("Escoge un número del registro de docentes");
			        materias[m].setDocente(docentes[d]);
				}
				break;
			case "Asignar materia a alumno":
				if (incMat == 0 || incAlu == 0 || incDoc == 0)
					Tools.salidaError("No hay materias aun registradas o alumnos");
				else {
					Tools.imprimeSalida("Alumnos registrados\n" + imprimeDatosAlumnos( tamAlu , alumnos ) +
										"\nMaterias Disponibles\n" + imprimeMaterias(tamMat , materias));
					byte a = Tools.leerByte("Escoge un numero del registro de alumnos");
					byte m = Tools.leerByte("Escoge un numero del registro de materias");
					alumnos[a].AgregarMateria(materias[m]);
				}
				break;
			case "Salir":
				Tools.imprimeSalida("Saliendo...");
				break;
			}
		} while (!sel.equalsIgnoreCase("Salir"));
		
	}
	
	public static String imprimeDatosAlumnos(int tam, Alumno alumnos[]) {
		String cad = "";
		for (byte i = 0; i < tam; i++) 
			if ( alumnos[i] != null )
				cad += i + ".-" + alumnos[i].toString() + "\n";
		return cad;
	}
	
	public static String imprimeDatosDocentes(int tam, Docente docente[]) {
		String cad = "";
		for (byte i = 0; i < tam; i++)
			if (docente[i] != null) 
				cad += docente[i].toString() + "\n";
		return cad;
	}
	
	public static String imprimeMaterias(int tam, Materias materias[]) {
		String cad = "";
		for (byte i = 0; i < tam; i++)
			if (materias[i] != null)
				cad += i + ".-" + materias[i].toString2() + "\n";
		return cad;
	}
	
	public static String buscarAlumno(int tam, Alumno alumnos[], String dato) {
		String cad = "No se encuentra el alumno";
		for (byte i = 0; i < tam; i++) {
			if (alumnos[i] != null) {
				if (alumnos[i].getNumcontrol().equals(dato) || alumnos[i].getNombre().equals(dato)) {
					cad = alumnos[i].toString() + "\n" + alumnos[i].ImprimeMaterias();
				}
			}
		}
		return cad;
	}

}
