package visitor;

import composite.*;
import composite.SpecimenGroupAL;

public interface Visitor {

	public void visit(SpecimenGroupAL a);
	
	public void visit(SpecimenGroupHT a);
	
	public void visit(Specimen s);
	
}
