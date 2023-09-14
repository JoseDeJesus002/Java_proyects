package time.timer;

public class Minutos extends Thread {
	protected int min;
	@Override
	public void run() 
	{
		
		try 
		{
			while(true) 
			{
				System.out.print(min +":");
				Thread.sleep(60000);
				//Thread.sleep(2000);
				min ++;
				if (min==60) {
					min=0;
				}
			}
		}
		catch (Exception e)
		{
		System.out.println(e);
		}
	}
}
