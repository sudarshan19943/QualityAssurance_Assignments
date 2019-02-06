import java.util.ArrayList;

public class Employer
{
	
	ArrayList<IWageCalculator> workers;

	public Employer()
	{
		workers = new ArrayList<IWageCalculator>();
		for (int i = 0; i < 5; i++)
		{
			workers.add(new HourlyWorker());
		}
		
		for (int i = 0; i < 5; i++)
		{
			workers.add(new SalaryWorker());
		}
	}

	public void outputWageCostsForAllStaff(int hours)
	{
		float cost = 0.0f;
		
		for (int i = 0; i < workers.size(); i++)
		{
			IWageCalculator worker = workers.get(i);
			cost += worker.calculatePay(hours);
		}
		
		System.out.println("Total wage cost for all staff = $" + cost);
	}

}