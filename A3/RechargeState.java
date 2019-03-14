public class RechargeState extends State {

	private State state;
	private IBattery battery;

	public RechargeState(IBattery battery, State state) {
		this.battery = battery;
		this.state = state;
		minutesRequiredForState = 0;
	}

	@Override
	public State timeElapsed(int minutes) {
		battery.recharge(minutes);
		if(battery.isFullyCharged())
		{		
			return state;
		}
		return null;

	}

}

