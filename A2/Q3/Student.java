import java.io.*;
import java.util.Scanner;

public class Student
{
	String bannerID;
	String firstName;
	String lastName;
	String email;

	public Student()
	{
		bannerID = null;
		firstName = null;
		lastName = null;
		email = null;
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

	public void save()
	{
		try
		{
			PrintWriter writer = new PrintWriter("student.txt", "UTF-8");
			writer.println(bannerID);
			writer.println(firstName);
			writer.println(lastName);
			writer.println(email);
			writer.close();
		}
		catch (Exception e)
		{
			System.out.println("I am a bad programmer that hid an exception.");
		}
	}

	public void load()
	{
		try
		{
			Scanner in = new Scanner(new FileReader("student.txt"));
			bannerID = in.next();
			firstName = in.next();
			lastName = in.next();
			email = in.next();
		}
		catch (Exception e)
		{
			System.out.println("I am a bad programmer that hid an exception.");
		}
	}
}