package com.msg.zooPrj.composite;

import java.util.ArrayList;
import java.util.Iterator;

import com.msg.zooPrj.iterator.AnimalIterator;
import com.msg.zooPrj.singleton.ZooLog;
import com.msg.zooPrj.visitor.Visitor;

/*
 * This is the class for the Composite Design Pattern (Composite)
 * The ArrayList Version
 * */

public class SpecimenGroupAL implements Animal, AnimalIterator {
	protected ArrayList<Animal> animals;
	protected String name;

	public SpecimenGroupAL(String name) {
		super();
		this.name = name;
		this.animals = new ArrayList<Animal>();
		ZooLog.logger.trace("SpecimenGroupAL["+name+"] class created...");
	}

	@Override
	public void add(Animal a) {
		animals.add(a);
		ZooLog.logger.trace("An Element has been added to SpecimenGroupAL["+name+"] ...");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getInfo() {
		return name + " has " + animals.toString();
	}

	public String toString() {
		return getInfo();
	}

	@Override
	public void acceptVisitor(Visitor v) {
		for (Animal a : animals)
			a.acceptVisitor(v);
		v.visit(this);
	}

	@Override
	public Iterator createIterator() {
		return animals.iterator();
	}
}
