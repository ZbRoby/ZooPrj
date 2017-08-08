package composite;

import java.util.HashMap;

import visitor.Visitor;

public class SpecimenGroupHT implements Animal {
	protected HashMap<Integer,Animal> animals;
	protected String name;
	protected int index;
	
	public SpecimenGroupHT() {
		// TODO Auto-generated constructor stub
	}
	
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
	public int getAge() {
		// TODO Auto-generated method stub
		return -1;
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
	
}
