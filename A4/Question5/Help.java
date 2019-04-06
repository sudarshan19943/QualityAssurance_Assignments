import java.util.HashMap;

public class Help {
    HashMap<String, Command> commands = new HashMap<>();

    public Help() {

	commands.put("print", new Print());
	commands.put("open", new Open());
	commands.put("close", new Close());
    }

    public String getHelp(String command) {

	if (command != null && command.length() != 0) {
	    return commands.get(command).getHelp();
	}
	return ListAllCommands();
    }

    public String ListAllCommands() {
	return "Commands: print, open, close";
    }
}