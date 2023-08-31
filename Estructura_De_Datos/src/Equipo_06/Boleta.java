package Equipo_06;

public class Boleta 
{
		private float calif;
		private float calif2;
		private String materia;
		private String materia2;
		public Boleta() 
		{
			
		}
		public float getCalif() {
			return calif;
		}
		public void setCalif(float calif1) {
			this.calif = calif1;
		}
		public float getCalif2() {
			return calif2;
		}
		public void setCalif2(float calif2) {
			this.calif2 = calif2;
		}
		public String getMateria() {
			return materia;
		}
		public void setMateria(String materia1) {
			this.materia = materia1;
		}
		public String getMateria2() {
			return materia2;
		}
		public void setMateria2(String materia2) {
			this.materia2 = materia2;
		}
		
		public double promedio()
		{
			return(calif+calif2)/2;
		}
}
