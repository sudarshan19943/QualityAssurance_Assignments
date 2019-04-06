public class Open implements ICommand {

    @Override
    public String GetHelp() {
	return "open -f <path> [-create=0/1]";
    }
}