package time.timer;

public class Minutos extends Horas {
	protected int min=0;
	@Override
	public void run() 
	{
		try 
		{
			while(min<=59) 
			{
				min +=1;
			}
		}
		catch (Exception e)
		{
		System.out.println(e);
		}
	}
}
