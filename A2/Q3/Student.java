public class Student
{
	String bannerID;
	String firstName;
	String lastName;
	String email;

	public Student(String bannerID, String firstName, String lastName, String email, IStudentPersistance db)
	{
		this.bannerID = bannerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		db.save(this);
	}
	
	public Student(String bannerID, IStudentPersistance db)
	{
		this.bannerID = bannerID;
		db.load(this);
	}

	public void setBannerID(String bannerID)
	{
		this.bannerID = bannerID;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}
}