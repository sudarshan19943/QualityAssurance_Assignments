public class Person
{
	public String name;

	public Person()
	{
		name = "Rob";
	}

	public boolean isPersonRob()
	{
		return name.equals("Rob") && isRobsAddress("Rob street", "Rob city", "Rob province", "Rob postalcode");
	}

	private boolean isRobsAddress(String street, String city, String province, String postalCode)
	{
		return street.equals("Rob street") &&
			city.equals("Rob city") &&
			province.equals("Rob province") &&
			postalCode.equals("Rob postalcode");
	}
}