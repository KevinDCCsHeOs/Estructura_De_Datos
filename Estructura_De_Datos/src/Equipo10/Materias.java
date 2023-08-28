package Equipo10;

public class Materias {
	
	private String codigoMateria;
	private String nomMateria;
	private Docente docente;
	
	public Materias() { }
	
	public Materias(String codigoMateria, String nomMateria) {
		this.codigoMateria = codigoMateria;
		this.nomMateria = nomMateria;
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
	
	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
	    this.docente = docente;
	}

	@Override
	public String toString() {
		return "Materia [codigoMateria=" + codigoMateria + ", nomMateria=" + nomMateria + "]";
	}
	
	public String toString2() {
		String cad = "";
	    if (docente != null) {
	        cad += docente.toString() + "\n";
	    }
	    cad += "Materia [codigoMateria=" + codigoMateria + ", nomMateria=" + nomMateria + "]";
	    return cad;
	}

}
