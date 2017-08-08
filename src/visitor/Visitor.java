package visitor;

import composite.*;
import composite.Class;

public interface Visitor {

	public void visit(Class a);
	
	public void visit(Specimen s);
	
}
