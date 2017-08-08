package singleton;


import composite.Animal;
import composite.SpecimenGroupAL;

public class Singleton {
	
	private static Singleton instance=new Singleton();
	private Animal specime;
	
	public Animal getSpecime() {
		return specime;
	}

	public void setSpecime(Animal allLivingThings) {
		this.specime = allLivingThings;
	}

	private Singleton(){}
	
	public static Singleton getInstace() {
		
		
		
		return instance;
	}

}
