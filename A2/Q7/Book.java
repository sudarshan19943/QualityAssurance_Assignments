import java.time.Duration;
import java.util.ArrayList;

public class Book implements ILibraryItem
{
	public Duration getPlayTime()
	{
		return Duration.ZERO;
	}

	public String getAuthor()
	{
		return "Hemingway";
	}

	public String getTitle()
	{
		return "For Whom The Bell Tolls";
	}

	public boolean isDigitalOnly()
	{
		return false;
	}

	public ArrayList<String> getCastList()
	{
		return null;
	}
}