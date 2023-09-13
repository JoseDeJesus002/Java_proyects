package time.timer;
import java.lang.Thread;

public class Segundos extends Minutos{
	int seg=1;
	@Override
	public void run() {
		try {
			while(seg<=59) {
				Thread.sleep(1000);
				seg +=1;
		}
		}
		catch (Exception e){
		System.out.println(e);
		}
	}
}
