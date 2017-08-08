package composite;

import java.util.ArrayList;
import visitor.Visitor;
import java.util.Iterator;
import iterator.AnimalIterator;

public class SpecimenGroupAL implements Animal,AnimalIterator {
	protected ArrayList<Animal> animals;
	protected String name;
	
	public SpecimenGroupAL(String name) {
		super();
		this.name = name;
		this.animals=new ArrayList<Animal>();
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
		return name+" has "+animals.toString();
	}

	public String toString(){
		return getInfo();
	}

	@Override
	public void acceptVisitor(Visitor v) {
		for(Animal a : animals)
			a.acceptVisitor(v);
		v.visit(this);
	}
	
	@Override
	public Iterator createIterator() {
		return animals.iterator();
	}
}
