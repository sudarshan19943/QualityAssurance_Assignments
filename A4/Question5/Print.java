public class Print extends Command {

    @Override
    public String getHelp() {
	return "print -f <path> [-colour=0/1] [-two-sided=0/1]";
    }
}