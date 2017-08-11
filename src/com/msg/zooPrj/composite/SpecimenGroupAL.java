package com.msg.zooPrj.composite;

import java.util.ArrayList;
import java.util.Iterator;

import com.msg.zooPrj.iterator.AnimalIterator;
import com.msg.zooPrj.visitor.Visitor;

//This is the interface for the Composite Design Pattern (composite ,group , using )

public class SpecimenGroupAL implements Animal, AnimalIterator {
	protected ArrayList<Animal> animals;
	protected String name;

	public SpecimenGroupAL(String name) {
		super();
		this.name = name;
		this.animals = new ArrayList<Animal>();
	}

	@Override
	public void add(Animal a) {
		animals.add(a);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
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
