package timer;
import java.util.concurrent.TimeUnit;

public class Segundos extends Thread{
	 private int segundos;
	    @Override
	    public void run() {
	    	try {
	    		while(true){
	    			TimeUnit.SECONDS.sleep(1);
	    			segundos ++;
	    			 System.out.printf("\r%02d:%02d:%02d", segundos / 3600, (segundos % 3600) / 60, segundos % 60);
	    		}
	    	}catch(InterruptedException e){
	    		e.printStackTrace();
	    		
	    	}
	    }
	}
