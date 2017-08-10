package command;

import composite.Animal;
import singleton.ZooLog;
import visitor.SaveVisitor;

public class CommandSave implements Command{

	private Animal a;
	private SaveVisitor v2 ;
	
	public CommandSave(Animal a) {
		this.a = a;
		ZooLog.logger.trace("Save command created...");
		v2 = new SaveVisitor();
	}
	
	@Override
	public void execute() {
			
		v2.save( a,"test.txt");
		ZooLog.logger.trace("Save command executed...");
	}

}
