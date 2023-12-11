package pe.com.dyd.arquitectura.patrones.command;

import java.util.Arrays;
import java.util.Scanner;

import pe.com.dyd.arquitectura.patrones.command.util.CommandUtil;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		CommandManager commandManager = CommandManager.getInstance();
		
		while(true) {
			String newLine = scanner.nextLine();
			if (newLine .trim().isEmpty()) {
				continue;
			}
			
			String[] commandArgs = CommandUtil.tokenizerArgs(newLine);
			String commandName = commandArgs[0];
			String[] commandArgs2 = null;
			if (commandArgs.length > 1) {
				commandArgs2 = Arrays.copyOfRange(commandArgs, 1, commandArgs.length);
			}
			
			ICommand command = commandManager.getCommand(commandName);
			command.execute(commandArgs2, System.out);
		}
	}

}
