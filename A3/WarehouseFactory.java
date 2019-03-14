
public class WarehouseFactory implements IWarehouseFactory
{
	@Override
	public IBattery makeBattery(int capacity)
	{
		return new Battery(capacity);
	}

	@Override
	public IRobot makeRobot(int batteryCapacity)
	{
		IBattery battery = makeBattery(batteryCapacity);
		// TODO: Robots start in the IdleState, instantiate that here.
		State startState = makeIdleState();
		return new Robot(battery, startState);
	}
	
	public IRobot makeRobotWithBatteryPack(int batteryCapacity, int packCapacity)
	{
		// TODO: Implement the Decorator pattern, and use it to decorate a regular
		//       battery with a battery pack, and create a robot with the battery pack.
		IBattery batteryPack = makeBatteryPack(makeBattery(batteryCapacity), packCapacity);
		State startState = makeIdleState();
		return new Robot(batteryPack, startState);
	}

	@Override
	public State makeIdleState() {
		return new IdleState();
	}

	@Override
	public State makeClaimItemState() {
		return new ClaimItemState();
	}

	@Override
	public State makeFinishedState() {
		return new FinishedState();
	}

	@Override
	public State makeLoadTruckState() {
		return new LoadTruckState();
	}

	@Override
	public State makeMoveToShelfState() {
		return new MoveToShelfState();
	}

	@Override
	public State makeMoveToTruckState() {
		return new MoveToTruckState();
	}

	@Override
	public State makeTakeItemState() {
		return new TakeItemState();
	}

	@Override
	public IBattery makeBatteryPack(IBattery battery, int packCapacity) {
		return new BatteryPack(battery, packCapacity);
	}

	@Override
	public State makeRechargeState(IBattery battery, State state) {
		return new RechargeState(battery, state);
	}

	@Override
	public TimerSubject makeTimerSubject() {
		return new TimerSubject();
	}

}
