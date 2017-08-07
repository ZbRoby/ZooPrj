import java.util.ArrayList;

public class NotMain {
	public static void main(String[] args) {
		ArrayList<Animal> animals=new ArrayList<Animal>();
		
		int nr=17;
			
		animals.add(new Animal());
		animals.add(new Mammal());
		animals.add(new Reptile());
		animals.add(new Crow());
		animals.add(new Eagle());
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Snake());
		animals.add(new Lizard());
		animals.add(new Animal());
		animals.add(new Mammal());
		animals.add(new Reptile());
		animals.add(new Crow());
		animals.add(new Eagle());
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Snake());
		animals.add(new Lizard());

		for(int i=0;i<=nr;i++)
			System.out.println(animals.get(i));
	}
}
