public class Mexico implements ICountryGDPReport
{
	
	public String getAgriculture()
	{
		return "$50000000 MXN";
	}

	public String getTourism()
	{
		return "$100000 MXN";
	}

	@Override
	public void calculateEconomy() {
		System.out.println("- Mexico:\n");
		System.out.println("   - Agriculture: " + getAgriculture());
		System.out.println("   - Tourism: " + getTourism());
	}
}
