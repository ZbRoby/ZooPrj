package composite;

import java.util.ArrayList;

public class Class implements Animal {
	protected ArrayList<Animal> animals;
	protected String name;
	
	public Class() {
		// TODO Auto-generated constructor stub
	}
	
	public Class(String name) {
		
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
}
