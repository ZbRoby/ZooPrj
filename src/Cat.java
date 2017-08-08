
public class Cat extends Mammal {

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age, double heigth, double weight) {
		super(name, age, heigth, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cat [getName()=" + getName() + ", getAge()=" + getAge() + ", getHeigth()=" + getHeigth()
				+ ", getWight()=" + getWight() + "]";
	}
	
	
}
