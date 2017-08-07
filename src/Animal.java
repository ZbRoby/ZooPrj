
public class Animal {
	private String name;
	private int age;
	private double heigth;
	private double weight;
	
	public Animal(String name, int age, double heigth, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.heigth = heigth;
		this.weight = weight;
		
	}
	
	public Animal(){
		this.name = "default";
		this.age = (int) (Math.random()*1000)%20;
		this.heigth = Math.random()*10;
		this.weight = Math.random()*100;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getHeigth() {
		return heigth;
	}
	
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
	public double getWight() {
		return weight;
	}
	
	public void setWight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", heigth=" + heigth + ", weight=" + weight + "]";
	}
	
	
	
}
