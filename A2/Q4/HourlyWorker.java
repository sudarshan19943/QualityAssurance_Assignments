public class HourlyWorker
{
	private float hourlyRate;

	public HourlyWorker()
	{
		hourlyRate = 10.0f;
	}

	public float calculatePay(int hours)
	{
		return hourlyRate * hours;
	}
}