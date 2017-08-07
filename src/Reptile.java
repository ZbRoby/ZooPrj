
public class Reptile extends Animal{

	public Reptile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reptile(String name, int age, double heigth, double weight) {
		super(name, age, heigth, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Reptile [getName()=" + getName() + ", getAge()=" + getAge() + ", getHeigth()=" + getHeigth()
				+ ", getWight()=" + getWight() + "]";
	}

	
}
