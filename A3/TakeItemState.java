public class TakeItemState extends State {

	public TakeItemState() 
	{
		minutesRequiredForState = 2;
	}

	@Override
	public State timeElapsed(int minutes) {

		minutesElapsed = minutes + minutesElapsed;
		if(minutesElapsed == minutesRequiredForState) 
		{
			return Simulation.instance().getFactory().makeMoveToTruckState();
		}
		return null;
	}

}