import java.util.ArrayList;

public class Employer
{
	ArrayList<HourlyWorker> hourlyWorkers;
	ArrayList<SalaryWorker> salaryWorkers;

	public Employer()
	{
		hourlyWorkers = new ArrayList<HourlyWorker>();
		for (int i = 0; i < 5; i++)
		{
			hourlyWorkers.add(new HourlyWorker());
		}
		salaryWorkers = new ArrayList<SalaryWorker>();
		for (int i = 0; i < 5; i++)
		{
			salaryWorkers.add(new SalaryWorker());
		}
	}

	public void outputWageCostsForAllStaff(int hours)
	{
		float cost = 0.0f;
		for (int i = 0; i < hourlyWorkers.size(); i++)
		{
			HourlyWorker worker = hourlyWorkers.get(i);
			cost += worker.calculatePay(hours);
		}
		for (int i = 0; i < salaryWorkers.size(); i++)
		{
			SalaryWorker worker = salaryWorkers.get(i);
			cost += worker.calculatePay(hours);
		}
		System.out.println("Total wage cost for all staff = $" + cost);
	}
}