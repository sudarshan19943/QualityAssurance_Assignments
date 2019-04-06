public class Print implements ICommand {

    @Override
    public String GetHelp() {
	return "print -f <path> [-colour=0/1] [-two-sided=0/1]";
    }
}