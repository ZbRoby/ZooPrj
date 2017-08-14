package com.msg.zooPrj.composite;

import com.msg.zooPrj.singleton.ZooLog;
import com.msg.zooPrj.visitor.Visitor;

/*
 * This is the class for the Composite Design Pattern (Leaf)
 * */
public class Specimen implements Animal {
	protected String name;
	protected int age;

	public Specimen(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		ZooLog.logger.trace("Specimen["+name+","+age+"] class created...");
	}

	@Override
	public void add(Animal a) {
		// Nothing should be added to a leaf
	}

	@Override
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String getInfo() {
		return name + " has age:" + age;
	}

	@Override
	public String toString() {
		return getInfo();
	}

	@Override
	public void acceptVisitor(Visitor v) {
		v.visit(this);
	}

}
