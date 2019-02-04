public class EmailSender extends Customer
{
	public EmailSender(String email, String country, String province)
	{
		super(email, country, province);
	}

	public void sendEmail(String emailAddress, String subject, String message)
	{
		// I'm pretending to send an email!
		System.out.println("To: " + emailAddress);
		System.out.println("Subject: " + subject);
		System.out.println("Message: \n\n" + message);
	}

	public void emailCustomerSpecialOffer()
	{

		String msg = "Congratulations! Your purchase history has earned you a 10% discount on your next purchase!";
		sendEmail(email, "10% off your next order!", msg);
	}
}