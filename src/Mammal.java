
public class Mammal extends Animal {
	
	
	
	public Mammal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mammal(String name, int age, double heigth, double weight) {
		super(name, age, heigth, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mammal [getName()=" + getName() + ", getAge()=" + getAge() + ", getHeigth()=" + getHeigth()
				+ ", getWight()=" + getWight()+ "]";
	}
	
	
}
