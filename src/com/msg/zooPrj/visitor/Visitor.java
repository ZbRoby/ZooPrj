package com.msg.zooPrj.visitor;

import com.msg.zooPrj.composite.*;

/**
 *
 * @author marius Interface for visitor design pattern
 */
public interface Visitor {

    void visit(SpecimenGroupAL a);

    void visit(SpecimenGroupHM a);

    void visit(Specimen s);

}
