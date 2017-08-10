package command;

import composite.Animal;
import visitor.ConcreteVisitor2;

public class CommandSave implements Command{

	private Animal a;
	private ConcreteVisitor2 v2 = new ConcreteVisitor2();
	
	public CommandSave(Animal a) {
		this.a = a;
		
	}
	
	@Override
	public void execute() {
			
		v2.save( a,"test.txt");
	}

}
