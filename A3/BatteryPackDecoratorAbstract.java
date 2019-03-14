public abstract class BatteryPackDecoratorAbstract implements IBattery {
	
	protected IBattery batteryToDecorate;
	
	public BatteryPackDecoratorAbstract(IBattery batteryToDecorate)
	{
		this.batteryToDecorate = batteryToDecorate;
	}
	
	public abstract boolean hasEnoughPowerForMinutes(int minutes);
	public abstract boolean isFullyCharged();
	public abstract void drain(int minutes);
	public abstract void recharge(int minutes);
}
