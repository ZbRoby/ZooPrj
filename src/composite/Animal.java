package composite;

import visitor.Visitor;

public interface Animal {
	
	public void add(Animal a);
	public String getName();
	public int getAge();
	public String getInfo();
	
	public void acceptVisitor(Visitor v);
}
