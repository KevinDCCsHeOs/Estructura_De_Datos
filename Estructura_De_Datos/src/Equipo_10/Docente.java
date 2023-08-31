package Equipo_10;

public class Docente {
	
	private String codDocente;
	private String nomDocente;
	
	public Docente() { }
	
	public Docente(String codDocente, String nomDocente) {
		this.codDocente = codDocente;
		this.nomDocente = nomDocente;
	}

	public String getCodDocente() {
		return codDocente;
	}

	public void setCodDocente(String codDocente) {
		this.codDocente = codDocente;
	}

	public String getNomDocente() {
		return nomDocente;
	}

	public void setNomDocente(String nomDocente) {
		this.nomDocente = nomDocente;
	}

	@Override
	public String toString() {
		return "Docente [codDocente=" + codDocente + ", nomDocente=" + nomDocente + "]";
	}
	
}
