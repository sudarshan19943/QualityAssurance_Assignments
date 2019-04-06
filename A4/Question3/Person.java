public class Person
{
	public String name;
	public String street; 
	public String city;
	public String province;
	public String postalCode;

	public Person()
	{
		name = "Rob";
		street = "Rob street";
		city = "Rob city";
		province = "Rob province";
		postalCode = "Rob postalcode";
		
	}

	public boolean isPersonRob()
	{
		
		return name.equals("Rob") && isRobsAddress();
	}

	private boolean isRobsAddress()
	{
		return street.equals("Rob street") &&
			city.equals("Rob city") &&
			province.equals("Rob province") &&
			postalCode.equals("Rob postalcode");
	}
}