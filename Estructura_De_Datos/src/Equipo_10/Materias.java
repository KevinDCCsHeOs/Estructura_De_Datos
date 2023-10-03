package Equipo_10;

import java.util.Vector;

import Equipo_10.Docente;

public class Materias {
	
	private String codigoMateria;
	private String nomMateria;
	private Vector<Docente> docente;
	
	public Materias() { }
	
	public Materias(String codigoMateria, String nomMateria) {
		this.codigoMateria = codigoMateria;
		this.nomMateria = nomMateria;
		this.docente = new Vector<>();
	}

	public String getCodigoMateria() {
		return codigoMateria;
	}

	public void setCodigoMateria(String codigoMateria) {
		this.codigoMateria = codigoMateria;
	}

	public String getNomMateria() {
		return nomMateria;
	}

	public void setNomMateria(String nomMateria) {
		this.nomMateria = nomMateria;
	}
	
	public Vector<Docente> getDocente() {
		return docente;
	}

	public void setDocente(Vector<Docente> docente) {
		this.docente = docente;
	}

	@Override
	public String toString() {
		return "Materia [codigoMateria=" + codigoMateria + ", nomMateria=" + nomMateria + "]";
	}
	
	public String toString2() {
		String cad = "";
	    if (docente.get(0) != null) {
	        cad += docente.get(0) + "\n";
	    }
	    cad += "Materia [codigoMateria=" + codigoMateria + ", nomMateria=" + nomMateria + "]";
	    return cad;
	}

}
