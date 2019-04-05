public class Person
{
	private String name;

	private String areaCode;
	private String phoneNumber;

	private String userName;
	private String password;

	public Person(String name)
	{
		this.name = name;
	}

	public void setAreaCode(String areaCode)
	{
		this.areaCode = areaCode;
	}
	public String getAreaCode()
	{
		return areaCode;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber()
	{
		if (areaCode != null && areaCode != "")
		{
			return "(" + areaCode + ") " + phoneNumber; 
		}
		return phoneNumber;
	}

	public void setLoginCredentials(String userName, String password)
	{
		this.userName = userName;
		this.password = password;
	}
	public boolean authenticateUser()
	{
		return (userName.equals("joe") && password.equals("joepass"));
	}
}