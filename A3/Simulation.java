import java.util.*;

public class Simulation
{
	private static Simulation theOneInstance = null;
	private IWarehouseFactory factory;
	private List<Object> robots;
	private int minutesToCompleteSimulation;
	private Shelf shelf;
	private TimerSubject timersubject;

	public Simulation()
	{
		robots = new ArrayList<Object>();
		minutesToCompleteSimulation = 0;
		shelf = new Shelf();
	}

	public static Simulation instance()
	{
		if (null == theOneInstance)
		{
			theOneInstance = new Simulation();
		}
		return theOneInstance;
	}

	public IWarehouseFactory getFactory()
	{
		return factory;
	}

	public Shelf getShelf()
	{
		return shelf;
	}

	public void build(Arguments args, IWarehouseFactory factory)
	{
		this.factory = factory;
		shelf.setItemCount(args.getShelfCount());
		timersubject = factory.makeTimerSubject();
		for (int i = 0 ; i < args.getNumBatteryPacks(); i++)
		{
			IRobot observer = factory.makeRobotWithBatteryPack(args.getDefaultBatteryCapacity(), args.getBatteryPackCapacity());
			robots.add(observer);
			timersubject.attach(observer);
		}

		for (int i = 0 ; i < (args.getNumRobots() - args.getNumBatteryPacks()); i++)
		{
			IRobot observer = factory.makeRobot(args.getDefaultBatteryCapacity());
			robots.add(observer);
			timersubject.attach(observer);
		}
	}

	public int run()
	{
		System.out.println("Simulation begun!");
		boolean robotsStillWorking = true;
		while (robotsStillWorking)
		{
			timersubject.notifySubjects();
			minutesToCompleteSimulation += 1;
			// Check all robots to see whether they are finished.
			robotsStillWorking = false;
			ListIterator<Object> iter = robots.listIterator();
			while (iter.hasNext())
			{
				IRobot robot = (IRobot)iter.next();
				if (robot.isWorking())
				{
					robotsStillWorking = true;
					break;
				}
			}
		}
		System.out.println("Simulation complete!");
		return minutesToCompleteSimulation;
	}
}

















