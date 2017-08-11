package com.msg.zooPrj.visitor;

import com.msg.zooPrj.composite.*;

/**
 * Interface for visitor design pattern
 */

public interface Visitor {

	public void visit(SpecimenGroupAL a);

	public void visit(SpecimenGroupHT a);

	public void visit(Specimen s);

}
