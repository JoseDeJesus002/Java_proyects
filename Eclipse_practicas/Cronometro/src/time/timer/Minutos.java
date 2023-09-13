package time.timer;
import java.lang.Thread;

public class Minutos extends Thread {
	int min=0;
	@Override
	public void run() {
		try {
			while(min<=59) {
				Thread.sleep(60000);  //60*1000
				min +=1;
			}
		}
		catch (Exception e){
		System.out.println(e);
		}
	}
}
