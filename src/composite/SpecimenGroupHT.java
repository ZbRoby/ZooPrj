package composite;

import java.util.HashMap;
import java.util.Iterator;

import visitor.Visitor;
import iterator.AnimalIterator;


public class SpecimenGroupHT implements Animal,AnimalIterator {
	protected HashMap<Integer,Animal> animals;
	protected String name;
	protected int index;
	
	public SpecimenGroupHT(String name) {
		
		super();
		this.name = name;
		this.animals=new HashMap<Integer,Animal>();
		this.index=0;
	}

	@Override
	public void add(Animal a) {
		animals.put(index,a);
		index++;
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
		for(int i=0;i<index;i++)
			animals.get(i).acceptVisitor(v);
		
		v.visit(this);
	}

	@Override
	public Iterator createIterator() {
		return animals.values().iterator();
	}
}
