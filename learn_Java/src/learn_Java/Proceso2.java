package learn_Java;

//2do_Metodo
public class Proceso2 implements Runnable{
	
	@Override
	public void run() {
		for (int x=6; x<=10; x++) {
			System.out.println(x);
		}
	}
}
