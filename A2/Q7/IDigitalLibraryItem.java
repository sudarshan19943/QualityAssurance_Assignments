import java.time.Duration;
import java.util.ArrayList;

public interface IDigitalLibraryItem {
	public Duration getPlayTime();
	public ArrayList<String> getCastList();
	public String getTitle();
}