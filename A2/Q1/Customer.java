public class Customer
{
	private String email;
	private String country;
	private String province;

	public Customer()
	{
		email = "joe@email.com";
		country = "Canada";
		province = "Nova Scotia";
	}

	public boolean isCanadian()
	{
		return country.equals("Canada");
	}

	public boolean isNovaScotian()
	{
		return province.equals("Nova Scotia");
	}

	public void emailCustomerSpecialOffer()
	{
		String msg = "Congratulations! Your purchase history has earned you a 10% discount on your next purchase!";
		EmailSender sender = new EmailSender();
		sender.sendEmail(email, "10% off your next order!", msg);
	}
}