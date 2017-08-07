
public class Snake extends Reptile{

	public Snake() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Snake(String name, int age, double heigth, double weight) {
		super(name, age, heigth, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Snake [getName()=" + getName() + ", getAge()=" + getAge() + ", getHeigth()=" + getHeigth()
				+ ", getWight()=" + getWight() + "]";
	}

}
