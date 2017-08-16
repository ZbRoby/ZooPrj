package com.msg.zooPrj.composite;

import java.util.HashMap;
import java.util.Iterator;

import com.msg.zooPrj.iterator.AnimalIterator;
import com.msg.zooPrj.singleton.ZooLog;
import com.msg.zooPrj.visitor.Visitor;

/*
 * This is the class for the Composite Design Pattern (Composite)
 * The HashMap Version
 * */

public class SpecimenGroupHM implements Animal, AnimalIterator {
	protected HashMap<Integer, Animal> animals;
	protected String name;
	protected int index;

	public SpecimenGroupHM(String name) {

		super();
		this.name = name;
		this.animals = new HashMap<Integer, Animal>();
		this.index = 0;
		ZooLog.logger.trace("SpecimenGroupHM["+name+"] class created...");
	}

	@Override
	public void add(Animal a) {
		animals.put(index, a);
		index++;
		ZooLog.logger.trace("An Element has been added to SpecimenGroupHM["+name+"] ...");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getInfo() {
		return name + " has " + animals.toString();
	}
	
	@Override
	public String toString() {
		return getInfo();
	}

	@Override
	public void acceptVisitor(Visitor v) {
		for (int i = 0; i < index; i++)
			animals.get(i).acceptVisitor(v);

		v.visit(this);
	}

	@Override
	public Iterator<?> createIterator() {
		return animals.values().iterator();
	}
}
