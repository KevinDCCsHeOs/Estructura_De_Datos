package Equipo_05;

public class MultipliTabla {
	
	public void generadordetabla(int tabla, int largo) {
		if(largo > 1)
			generadordetabla(tabla, largo - 1);
		if((tabla * largo) >= 0)
			System.out.printf("%d X %d = %d \n", tabla, largo, (tabla * largo));
	}

}
