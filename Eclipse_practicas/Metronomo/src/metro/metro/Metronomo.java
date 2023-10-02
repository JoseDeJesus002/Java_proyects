package metro.metro;
import java.util.Scanner;

public class Metronomo extends Thread{
	int speed;
	boolean detenido;
	
	public void ingresoDatos() {
		Scanner scannerSpeed = new Scanner(System.in);
		System.out.print("Ingresa la velocidad: ");
		speed = scannerSpeed.nextInt();
	}
	
	@Override
	public void run() {
		
		ingresoDatos();
		
		try {
			while(!detenido) {
			System.out.println("beep");
			Thread.sleep(60000/speed);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
