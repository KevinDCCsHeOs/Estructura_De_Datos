package Equipo_10;

import java.util.Vector;
import Equipo_10.*;

public class Test {
	
	public static void main(String[] args) {
		CapturaDatos();
	}
	
	public static void CapturaDatos() {
		
		String sel = "";
		int tamAlu = Tools.leerEntero("Dame el numero de alumnos a crear: "), incAlu = 0;
		int tamDoc = Tools.leerEntero("Dame el numero de docentes a crear: "), incDoc = 0;
		int tamMat = Tools.leerEntero("Dame el numero de materias a crear: "), incMat = 0;
		Vector<Alumno> alumnos = new Vector<>(tamAlu);
		Vector<Docente> docentes = new Vector<>(tamDoc);
		Vector<Materias> materias = new Vector<>(tamMat);
		
		do {
			sel = Tools.Desplegable("¿Qué accion quieres realizar?",
					"Crear Alumno,Crear Docente,Crear Materia,Buscar informacion del Alumno,Asignar Docente a materia,Asignar materia a alumno,Salir");
			switch(sel) {
			case "Crear Alumno":
				if (incAlu < tamAlu) {
					alumnos.add( new Alumno(Tools.leerString("Dame el nombre del Alumno: "),
							Tools.leerString("Dame el numero de control del Alumno: "),
							Tools.leerByte("Dame la edad del Alumno: ")));
					incAlu++;
				} else 
					Tools.salidaError("Lista de alumnos llena");
				break;
			case "Crear Docente":
				if (incDoc < tamDoc) {
					docentes.add( new Docente(Tools.leerString("Dame el numero de control del Docente : "),
							Tools.leerString("Dame el nombre del Docente: ")));
					incDoc++;
				} else 
					Tools.salidaError("Lista de alumnos llena");
				break;
			case "Crear Materia":
				if (incMat < tamMat) {
					materias.add( new Materias(Tools.leerString("Dame el codigo de la Materia : "),
							Tools.leerString("Dame el nombre de la Materia: ")));
					incMat++;
				} else 
					Tools.salidaError("Lista de materias llena");
				break;
			case "Buscar informacion del Alumno":
				Tools.imprimeSalida("Alumnos registrados\n" + imprimeDatosAlumnos( alumnos ));
				Tools.imprimePantalla(buscarAlumno( alumnos, Tools.leerString("Nombre o numero de control a buscar: ")));
				break;
			case "Asignar Docente a materia":
				if (incMat == 0 || incDoc == 0)
					Tools.salidaError("No hay materias/Docentes aun registrados");
				else {
					Tools.imprimeSalida("Docentes Disponibles\n" + imprimeDatosDocentes(docentes) +
			                "\nMaterias Disponibles\n" + imprimeMaterias(materias));
					boolean tr = true;
			        byte d = Tools.leerByte("Escoge un número del registro de docentes");
			        do {
			        	if ( d >= 0 && d < docentes.size()) {
			        		tr = false;
			        	} else {
			        		d = Tools.leerByte("Escoge un número del registro de docentes entre :" + 0 + " y " + incDoc);
			        	}
			        }while(tr);
			        byte m = Tools.leerByte("Escoge un número del registro de materias");
			        tr = true;
					do {
						if( m < docentes.size() && m >= 0) {
							tr = false;
						} else {
			        		m = Tools.leerByte("Escoge un número del registro de docentes entre :" + 0 + " y " + incMat);
			        	}
					}while(tr);
					materias.get(m).setDocente(docentes.get(d));
				}
				break;
			case "Asignar materia a alumno":
				if (incMat == 0 || incAlu == 0 || incDoc == 0)
					Tools.salidaError("No hay materias aun registradas o alumnos");
				else {
					Tools.imprimeSalida("Alumnos registrados\n" + imprimeDatosAlumnos( alumnos ) +
										"\nMaterias Disponibles\n" + imprimeMaterias( materias));
					boolean tr = true;
					byte a = Tools.leerByte("Escoge un numero del registro de alumnos");
					do {
							if( a < incAlu && a >= 0) {
								tr = false;
						} else {
			        		a = Tools.leerByte("Escoge un número del registro de docentes entre :" + 0 + " y " + incAlu);
			        	}
					}while(tr);
					byte m = Tools.leerByte("Escoge un numero del registro de materias");
					tr = true;
					do {
						if( m < incMat && m >= 0) {
							tr = false;
						} else {
			        		m = Tools.leerByte("Escoge un número del registro de docentes entre :" + 0 + " y " + incMat);
			        	}
					}while(tr);
					alumnos.get(a).AgregarMateria(materias.get(m));
				}
				break;
			case "Salir":
				Tools.imprimeSalida("Saliendo...");
				break;
			}
		} while (!sel.equalsIgnoreCase("Salir"));
		
	}
	
	public static String imprimeDatosAlumnos( Vector<Alumno> alumnos) {
		String cad = "";
		for (byte i = 0; i < alumnos.size(); i++) 
			if ( alumnos.get(i) != null )
				cad += i + ".-" + alumnos.get(i) + "\n";
		return cad;
	}
	
	public static String imprimeDatosDocentes( Vector<Docente> docente) {
		String cad = "";
		for (byte i = 0; i < docente.size() ; i++)
			if (docente.get(i) != null) 
				cad += docente.get(i) + "\n";
		return cad;
	}
	
	public static String imprimeMaterias( Vector<Materias> materias) {
		String cad = "";
		for (byte i = 0; i < materias.size(); i++)
			if (materias.get(i) != null)
				cad += i + ".-" + materias.get(i).toString2() + "\n";
		return cad;
	}
	
	public static String buscarAlumno( Vector<Alumno> alumnos, String dato) {
	    String cad = "No se encuentra el alumno";
	    for (int i = 0; i < alumnos.size(); i++) {
	        Alumno alumno = alumnos.get(i);
	        if (alumno != null) {
	            if (alumno.getNumcontrol().equals(dato) || alumno.getNombre().equals(dato)) {
	                cad = alumno.toString() + "\n" + alumno.ImprimeMaterias();
	            }
	        }
	    }
	    return cad;
	}

}
