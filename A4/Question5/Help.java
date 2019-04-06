import java.util.HashMap;

public class Help {
    HashMap<String, ICommand> cmds = new HashMap<>();

    public Help() {
	cmds.put("print", new Print());
	cmds.put("open", new Open());
	cmds.put("close", new Close());
    }

    public String getHelp(String command) {
	if (command != null && command.length() != 0) {
	    return cmds.get(command).GetHelp();
	}
	return ListAllCommands();
    }

    public String ListAllCommands() {
	return "Commands: print, open, close";
    }
}