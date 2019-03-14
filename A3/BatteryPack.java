public class BatteryPack extends BatteryPackDecoratorAbstract{
	private int packCharge;
	private int packCapacity;

	public BatteryPack(IBattery batteryToDecorate, int packCapacity) { 
		super(batteryToDecorate);
		this.packCapacity = packCapacity;
		this.packCharge = packCapacity;
	}

	@Override
	public boolean hasEnoughPowerForMinutes(int minutes) {
		Battery normalBattery = (Battery)batteryToDecorate;
		if (packCharge - minutes >= 0)
		{
			return true;
		}
		else if(normalBattery.getCharge() - minutes >= 0)
		{
			return true;
		}
		else
		{
			return ((packCharge + normalBattery.getCharge()) - minutes >= 0);
		}
	}

	@Override
	public boolean isFullyCharged() {
		return (packCharge == packCapacity);
	}

	@Override
	public void drain(int minutes) {
		//Drain first the battery pack and then drain regular battery
		if (packCharge != 0) 
		{
			packCharge -= minutes;
			packCharge = Math.max(packCharge, 0);
		} 
		else 
		{
			batteryToDecorate.drain(minutes);
		}
	}

	@Override
	public void recharge(int minutes) {
		//Charge regular battery first and then the battery pack
		if (batteryToDecorate.isFullyCharged()) 
		{
			packCharge += minutes * 2;
			packCharge = Math.min(packCapacity, packCharge);
		} 
		else 
		{
			batteryToDecorate.recharge(minutes);
		}
	}

}

