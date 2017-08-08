package visitor;

import composite.SpecimenGroupAL;
import composite.SpecimenGroupHT;
import composite.Specimen;


public class ConcreteVisitor implements Visitor{

	private int coutClass = 0;
	
	private int coutSpecimen = 0;
	
	@Override
	public void visit(SpecimenGroupAL a) {
		coutClass++;
		
	}
	
	@Override
	public void visit(SpecimenGroupHT a) {
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