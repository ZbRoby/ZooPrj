package com.msg.zooPrj.composite;

import com.msg.zooPrj.visitor.Visitor;

//This is the interface for the Composite Design Pattern (component)

public interface Animal {

	public void add(Animal a);

	public String getName();

	public String getInfo();

	public void acceptVisitor(Visitor v);
}
