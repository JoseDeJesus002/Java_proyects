package time.timer;
import java.lang.Thread;

public class Horas extends Minutos {
 //3600
	int hour=0;
	@Override
	public void run() {
		try {
			while(hour<=59) {
				Thread.sleep(60000);  //60*1000
				hour +=1;
			}
		}
		catch (Exception e){
		System.out.println(e);
		}
	}
}
