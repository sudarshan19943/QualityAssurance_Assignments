public class Robot implements IRobot, ITimerObserver
{
	private IBattery battery;
	private State state;

	public Robot(IBattery battery, State startState)
	{
		this.battery = battery;
		state = startState;
	}

	@Override
	public void timeElapsed(int minutes)
	{
		State transitionState = state.timeElapsed(minutes);
		if (transitionState != null)
		{
			if (battery.hasEnoughPowerForMinutes(transitionState.getChargeRequiredForState()))
			{
				battery.drain(transitionState.getChargeRequiredForState());
				state = transitionState;
			}
			else
			{
				// TODO: You must implement your recharge state transition logic here.
				state = Simulation.instance().getFactory().makeRechargeState(battery, transitionState);
			}
		}
	}

	@Override
	public boolean isWorking()
	{
		return !state.isFinished();
	}
}
