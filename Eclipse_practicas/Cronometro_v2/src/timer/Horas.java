package timer;
import java.util.concurrent.TimeUnit;

public class Horas extends Thread {
	private int horas;

    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.HOURS.sleep(1);
                horas++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
