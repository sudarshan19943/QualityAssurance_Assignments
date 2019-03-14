public class LoadTruckState extends State {

	public LoadTruckState()
	{
		minutesRequiredForState = 5;
	}

	@Override
	public State timeElapsed(int minutes) {
		minutesElapsed = minutes + minutesElapsed;
		if(minutesElapsed == minutesRequiredForState) 
		{
			return Simulation.instance().getFactory().makeIdleState();
		}
		return null;
	}

}