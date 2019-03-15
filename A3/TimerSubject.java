import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TimerSubject {
	private List<IRobot> observers;
	private static TimerSubject timerInstance = null;
	private int MINUTES = 1;

	public TimerSubject() 
	{
		observers = new ArrayList<IRobot>();
	}

	public static TimerSubject instance()
	{
		if(timerInstance == null)
		{
			timerInstance = new TimerSubject();
		}
		return timerInstance;	
	}

	public void attach(IRobot observer)
	{
		observers.add(observer);
	}

	public void detach(IRobot observer)
	{
		observers.remove(observer);
	}

	public void notifySubjects()
	{
		ListIterator<IRobot> iter = observers.listIterator();
		while (iter.hasNext())
		{
			((Robot) iter.next()).timeElapsed(MINUTES);
		}

	}
}
