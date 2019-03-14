public class MoveToShelfState extends State {

	public MoveToShelfState() 
	{
		minutesRequiredForState = 4;
	}

	@Override
	public State timeElapsed(int minutes) {
		minutesElapsed = minutes + minutesElapsed;
		if(minutesElapsed == minutesRequiredForState) 
		{
			return Simulation.instance().getFactory().makeTakeItemState();
		}
		return null;
	}
}

