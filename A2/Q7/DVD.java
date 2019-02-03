import java.time.Duration;
import java.util.ArrayList;

public class DVD implements ILibraryItem
{
	public Duration getPlayTime()
	{
		return Duration.ofMinutes(135);
	}

	public String getAuthor()
	{
		return null;
	}

	public String getTitle()
	{
		return "Solo: A Star Wars Story";
	}

	public boolean isDigitalOnly()
	{
		return false;
	}

	public ArrayList<String> getCastList()
	{
		ArrayList<String> cast = new ArrayList<String>();
		cast.add("Alden Ehrenreich");
		cast.add("Joonas Suotamo");
		cast.add("Woody Harrelson");
		cast.add("Emilia Clarke");
		cast.add("Donald Glover");
		cast.add("Thandie Newton");
		cast.add("Paul Bettany");
		return cast;
	}
}