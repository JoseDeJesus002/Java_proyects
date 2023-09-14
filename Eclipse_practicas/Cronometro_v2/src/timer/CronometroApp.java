package timer;
import java.util.concurrent.TimeUnit;

public class CronometroApp {
	public static void main(String[]args) {
	 Horas Horas = new Horas();
     Minutos Minutos = new Minutos();
     Segundos Segundos = new Segundos();

     Thread threadHoras = new Thread(Horas);
     Thread threadMinutos = new Thread(Minutos);
     Thread threadSegundos = new Thread(Segundos);

     Horas.start();
     Minutos.start();
     Segundos.start();
	}
}
