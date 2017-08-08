
public class Crow extends Animal {

	public Crow() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Crow(String name, int age, double heigth, double weight) {
		super(name, age, heigth, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Crow [getName()=" + getName() + ", getAge()=" + getAge() + ", getHeigth()=" + getHeigth()
				+ ", getWight()=" + getWight() + "]";
	}
	
	
}
