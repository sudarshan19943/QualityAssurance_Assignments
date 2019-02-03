
import java.time.Duration;
import java.util.ArrayList;

public interface ILibraryItem
{
	public Duration getPlayTime();
	public String getAuthor();
	public String getTitle();
	public boolean isDigitalOnly();
	public ArrayList<String> getCastList();
}