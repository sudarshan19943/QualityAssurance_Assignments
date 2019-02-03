public class CountryGDPReport
{
	Canada canada;
	Mexico mexico;

	public CountryGDPReport()
	{
		canada = new Canada();
		mexico = new Mexico();
	}

	public void printCountryGDPReport()
	{
		System.out.println("GDP By Country:\n");
		System.out.println("- Canada:\n");
		System.out.println("   - Agriculture: " + canada.getAgriculture());
		System.out.println("   - Manufacturing: " + canada.getManufacturing());
		System.out.println("- Mexico:\n");
		System.out.println("   - Agriculture: " + mexico.getAgriculture());
		System.out.println("   - Tourism: " + mexico.getTourism());
	}
}