package command;

import composite.Animal;
import visitor.ConcreteVisitor2;

public class CommandSave implements Command{

	private Animal a;
	
	public CommandSave(Animal a) {
		this.a = a;
		
	}
	
	@Override
	public void execute() {
		
		ConcreteVisitor2 v2 = new ConcreteVisitor2();
		v2.save( a,"test.txt");
	}

}
