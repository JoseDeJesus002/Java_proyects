package time.timer;

public class Cronometro {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Segundos s1 = new Segundos();
		Minutos m1 = new Minutos();
		Horas h1 = new Horas();
		
		//Horas
		h1.start();
		
		try {
			m1.sleep(10);
		}catch(InterruptedException e) {
			System.out.println("Error Hilo1" + e );
		}
		
		/* Minutos */
		
		m1.start();
		
		try {
			m1.sleep(10);
		}catch(InterruptedException e) {
			System.out.println("Error Hilo1" + e );
		}
		
		//Segundos
		s1.start();
		try {
			s1.sleep(10);
		}catch(InterruptedException e) {
			System.out.println("Error Hilo1" + e );
		}
		
	}
}
