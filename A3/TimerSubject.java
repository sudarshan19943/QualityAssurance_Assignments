import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import java.awt.event.*;

import javax.swing.Timer;

public class TimerSubject {
	private List<IRobot> observers;
	private static TimerSubject timerInstance = null;

	public TimerSubject() {
		observers = new ArrayList<IRobot>();
		int delay = 1000; //milliseconds
		ActionListener taskPerformer = new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				notifySubjects();
			}
		};
		new Timer(delay, taskPerformer).start();
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
			((Robot) iter.next()).timeElapsed(1);
		}

	}
}
