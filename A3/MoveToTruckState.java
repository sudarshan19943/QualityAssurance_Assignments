public class MoveToTruckState extends State {

	public MoveToTruckState()
	{
		minutesRequiredForState = 4;
	}

	@Override
	public State timeElapsed(int minutes) {
		minutesElapsed = minutes + minutesElapsed;

		if(minutesElapsed == minutesRequiredForState) 
		{
			return Simulation.instance().getFactory().makeLoadTruckState();
		}
		return null;
	}

}
