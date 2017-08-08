
public class Lizard extends Reptile {

	public Lizard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lizard(String name, int age, double heigth, double weight) {
		super(name, age, heigth, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Lizard [getName()=" + getName() + ", getAge()=" + getAge() + ", getHeigth()=" + getHeigth()
				+ ", getWight()=" + getWight() + "]";
	}
	
}
