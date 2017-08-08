package visitor;

import composite.Class;
import composite.Specimen;


public class ConcreteVisitor implements Visitor{

	private int coutClass = 0;
	
	private int coutSpecimen = 0;
	
	@Override
	public void visit(Class a) {
		coutClass++;
		
	}
	@Override
	public void visit(Specimen m) {
		coutSpecimen++;
		
	}
	public int getCoutClass() {
		return coutClass;
	}
	public int getCoutSpecimen() {
		return coutSpecimen;
	}
	
	
	
}