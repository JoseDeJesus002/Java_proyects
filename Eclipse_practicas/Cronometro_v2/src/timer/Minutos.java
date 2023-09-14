package timer;
import java.util.concurrent.TimeUnit;

public class Minutos extends Thread {
	 private int minutos;

	    @Override
	    public void run() {
	        try {
	            while (true) {
	                TimeUnit.MINUTES.sleep(1);
	                minutos++;
	            }
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	 }
}
