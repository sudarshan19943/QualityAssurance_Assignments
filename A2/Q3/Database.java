import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Database implements IStudentPersistance{
	
	public void save(Student student)
	{
		try
		{
			PrintWriter writer = new PrintWriter("student.txt", "UTF-8");
			writer.println(student.bannerID);
			writer.println(student.firstName);
			writer.println(student.lastName);
			writer.println(student.email);
			writer.close();
		}
		catch (Exception e)
		{
			System.out.println("I am a bad programmer that hid an exception.");
		}
	}

	public void load(Student student)
	{
		try
		{
			Scanner in = new Scanner(new FileReader("student.txt"));
			student.bannerID = in.next();
			student.firstName = in.next();
			student.lastName = in.next();
			student.email = in.next();
		}
		catch (Exception e)
		{
			System.out.println("I am a bad programmer that hid an exception.");
		}
	}
}
