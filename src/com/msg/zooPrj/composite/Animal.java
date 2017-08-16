package com.msg.zooPrj.composite;

import com.msg.zooPrj.visitor.Visitor;

/*
*
*This is the interface for the Composite Design Pattern (component)
 */
public interface Animal {

    void add(Animal a);

    String getName();

    String getInfo();

    void acceptVisitor(Visitor v);
}
