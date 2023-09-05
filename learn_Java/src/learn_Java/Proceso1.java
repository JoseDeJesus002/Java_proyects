package learn_Java;

public class Proceso1 extends Thread{
	
	@Override
	public void run() {
		for (int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
}
