public class IdleState extends State {

	public IdleState() 
	{
		minutesRequiredForState = 0;
	}

	@Override
	public State timeElapsed(int minutes) {		
		minutesElapsed = minutes + minutesRequiredForState;

		if(minutesElapsed > minutesRequiredForState) 
		{
			if(Simulation.instance().getShelf().getItemCount() > 0)
			{
				return Simulation.instance().getFactory().makeClaimItemState();
			}
			else
			{
				return Simulation.instance().getFactory().makeFinishedState();
			}
		}
		return null; 
	}

}
