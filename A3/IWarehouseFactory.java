public interface IWarehouseFactory
{
	// Robots and batteries
	public IBattery makeBattery(int capacity);
	public IBattery makeBatteryPack(IBattery battery, int packCapacity);
	public IRobot makeRobot(int batteryCapacity);
	public IRobot makeRobotWithBatteryPack(int batteryCapacity, int packCapacity);
	// States
	// .. You must complete the interface with methods to instantiate your state objects.
	public State makeIdleState();
	public State makeClaimItemState();
	public State makeFinishedState();
	public State makeLoadTruckState();
	public State makeMoveToShelfState();
	public State makeMoveToTruckState();
	public State makeRechargeState(IBattery battery, State state);
	public State makeTakeItemState();
	public TimerSubject makeTimerSubject();
}
