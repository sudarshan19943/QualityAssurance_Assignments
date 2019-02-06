public class USDollarAccount extends Account
{
	static final float EXCHANGE_RATE = 0.75f;
	
	public USDollarAccount() {
		super();
	}
	
	public void credit(float amount) {
		super.credit(amount * EXCHANGE_RATE);
	}

	public void debit(float amount) {
		super.debit(amount * EXCHANGE_RATE);
	}	
}