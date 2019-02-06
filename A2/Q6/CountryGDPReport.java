public class CountryGDPReport
{
	public void printCountryGDPReport(ICountryGDPReport country)
	{
		System.out.println("GDP By Country:\n");
		country.calculateEconomy();
	}
}