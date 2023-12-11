package pe.com.dyd.arquitectura.patrones.command;

import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCommand extends AbstractCommand {

	public static final String COMMAND_NAME = "date";
	
	@Override
	public String getCommandName() {
		return COMMAND_NAME;
	}

	@Override
	public void execute(String[] args, OutputStream out) {
		String formatDate = "";
		if(args == null || args.length == 0) {
			formatDate = "dd/MM/yyyy hh:mm:ss";
		} else {
			formatDate = args[0];
		}
		
		SimpleDateFormat format = new SimpleDateFormat(formatDate);
		String fdate = format.format(new Date());
		write(out, fdate);
	}

}
