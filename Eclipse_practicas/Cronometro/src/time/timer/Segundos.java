package time.timer;
import java.lang.Thread;

public class Segundos extends Minutos {
	protected int seg=1;
	@Override
	public void run() 
	{
		try 
		{
			while(true) 
			{
				System.out.println( hour + ":" + min + ":" + seg);
				Thread.sleep(2);
				if(seg==59) 
				{
					seg=0;
					min+=1;
				}
				if (min==59) 
				{
					min=0;
					hour+=1;
				}
				seg +=1;
			}
		}
		catch (Exception e)
		{
		System.out.println(e);
		}
	}
}
