public class Account
{
	protected float balance;
	
	public Account() {
		balance = 0.0f;
	}
	
	public float getBalance()
	{
		return balance;
	}
	
	public void credit(float amount) {
		balance += amount;
	}

	public void debit(float amount) {
		balance -= amount;
	}
}