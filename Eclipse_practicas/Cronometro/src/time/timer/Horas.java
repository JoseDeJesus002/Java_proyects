package time.timer;

public class Horas extends Thread {
 //3600
	protected int hour=0;
	@Override
	public void run() 
	{
		try 
		{
			while(true) 
			{
				System.out.print(hour+":");
				Thread.sleep(3590000);
				//Thread.sleep(3000);
				hour ++;
			}
		}
		catch (Exception e)
		{
		System.out.println(e);
		}
	}
}
