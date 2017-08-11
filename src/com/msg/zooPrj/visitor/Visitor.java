package com.msg.zooPrj.visitor;

import com.msg.zooPrj.composite.*;

public interface Visitor {

	public void visit(SpecimenGroupAL a);

	public void visit(SpecimenGroupHT a);

	public void visit(Specimen s);

}
