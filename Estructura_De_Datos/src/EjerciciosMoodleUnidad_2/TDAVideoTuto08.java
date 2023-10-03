package EjerciciosMoodleUnidad_2;

public class TDAVideoTuto08 {

	public static void main(String[] args) {
		
		TDAVideoTuto08 objEsc = new TDAVideoTuto08();
		objEsc.bajarEscalera(20, 1);

	}
	
	public void bajarEscalera(int escalones, int numEsc) {
		if (escalones == 0) {
			System.out.println("Has terminado de bajar la escalera");
		} else {
			
			try {
				Thread.sleep(500);
				//System.out.println("Bajado escalon " + escalones);
				String cad = "";
				String per = ":)";
				for (int i = 1; i <=numEsc; i++)
					cad += "_";
				System.out.println("Bajando Escalon " + cad + per);
				bajarEscalera(escalones - 1, numEsc + 1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
