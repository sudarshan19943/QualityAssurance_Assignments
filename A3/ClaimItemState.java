public class ClaimItemState extends State {

	public ClaimItemState() 
	{
		minutesRequiredForState = 1;
	}
	@Override
	public State timeElapsed(int minutes) {

		minutesElapsed = minutes + minutesElapsed;
		if(minutesElapsed == minutesRequiredForState) 
		{
			if(Simulation.instance().getShelf().getItemCount() > 0)
			{
				Simulation.instance().getShelf().claimItem();
				return Simulation.instance().getFactory().makeMoveToShelfState();
			}
			else
			{
				return Simulation.instance().getFactory().makeIdleState();
			}
		}
		return null;
	}
}
