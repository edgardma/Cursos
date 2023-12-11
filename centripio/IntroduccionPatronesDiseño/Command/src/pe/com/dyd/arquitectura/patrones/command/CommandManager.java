package pe.com.dyd.arquitectura.patrones.command;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {
	
	private static CommandManager commandManager;
	private static Map<String, Class<? extends ICommand>> commands = new HashMap<>();
	
	private CommandManager() {
		regist(ExitCommand.COMMAND_NAME, ExitCommand.class);
		regist(DateCommand.COMMAND_NAME, DateCommand.class);
	}
	
	public synchronized static CommandManager getInstance() {
		if (commandManager == null) {
			commandManager = new CommandManager();
		}
		
		return commandManager;
	}
	
	public void regist(String commandName, Class<? extends ICommand> clazz) {
		commands.put(commandName, clazz);
	}
	
	public ICommand getCommand(String command) {
		if (!commands.containsKey(command)) {
			return new CommandNotFound();
		}
		
		try {
			ICommand icommand = commands.get(command).newInstance();
			return icommand;
		} catch (InstantiationException e) {
			e.printStackTrace();
			return null;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}
}
