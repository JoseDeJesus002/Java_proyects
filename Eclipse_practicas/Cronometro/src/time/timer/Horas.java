package time.timer;

public class Horas extends Thread {
 //3600
	protected int hour=0;
	@Override
	public void run() 
	{
		try 
		{
			while(hour<=12) 
			{
				hour +=1;
			}
		}
		catch (Exception e)
		{
		System.out.println(e);
		}
	}
}
