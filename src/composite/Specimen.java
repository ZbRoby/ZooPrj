package composite;

public class Specimen implements Animal{

	protected String name;
	protected int age;
	
	public Specimen(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public void add(Animal a) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return name+" has age:"+age;
	}
	
	public String toString(){
		return getInfo();
	}

}
