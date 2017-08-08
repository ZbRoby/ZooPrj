package composite;

import iterator.*;
import singleton.Singleton;
import visitor.ConcreteVisitor;
import visitor.ConcreteVisitor2;


public class NotMain {
	public static void main(String[] args) {
		
		Animal allLivingThings,mammal,reptile,shark,dog,cat,snake,lizard;
		allLivingThings=new SpecimenGroupAL("Animalia");
		
		mammal=new SpecimenGroupAL("Mammal");
		reptile=new SpecimenGroupHT("Reptile");
		
		shark=new Specimen("Shark",10);
		dog=new Specimen("Dog",9);
		cat=new Specimen("Cat",14);
		snake=new Specimen("Snake",2);
		lizard=new Specimen("Lizard",5);
		
		mammal.add(cat);
		mammal.add(dog);
		reptile.add(lizard);
		reptile.add(snake);
		allLivingThings.add(mammal);
		allLivingThings.add(reptile);
		allLivingThings.add(shark);
		System.out.println(allLivingThings.getInfo());
		//-----------------------------------------------
		
		Singleton.getInstace().setSpecime(allLivingThings);
		
		//---------------------------------------------
		
		ConcreteVisitor v = new ConcreteVisitor();
		
		allLivingThings.acceptVisitor(v);
		
		System.out.println("Specimen: "+v.getCoutSpecimen());
		System.out.println("Groups: "+v.getCoutClass());
		
		ConcreteVisitor2 v2 = new ConcreteVisitor2();
		v2.save( "test.txt");
		
		//-----------------------------------------------

		ZooWorker Horatiu = new ZooWorker((AnimalIterator) mammal,(AnimalIterator) reptile);
		Horatiu.show();
	}

}
