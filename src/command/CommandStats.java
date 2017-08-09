package command;

import composite.Animal;
import visitor.ConcreteVisitor;

public class CommandStats implements Command{
	
	private Animal a;
	
	public CommandStats(Animal a) {
		this.a = a;
	}

	@Override
	public void execute() {
		
		ConcreteVisitor v = new ConcreteVisitor();
		
		a.acceptVisitor(v);
		
		System.out.println("Specimen: "+v.getCoutSpecimen());
		System.out.println("Groups: "+v.getCoutClass());
		
	}

}
