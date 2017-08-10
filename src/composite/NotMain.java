package composite;

import singleton.Singleton;
import iterator.ZooWorker;
import iterator.AnimalIterator;


import command.Command;
import command.CommandSave;
import command.CommandStats;

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
		Singleton.getInstace().setSpecime(allLivingThings);
		
		//---------------------------------------------
		
		Command stats = new CommandStats(allLivingThings);
		stats.execute();
		
		Command save = new CommandSave(allLivingThings);
		save.execute();
		

		//-----------------------------------------------

		ZooWorker Horatiu = new ZooWorker((AnimalIterator) mammal,(AnimalIterator) reptile);
		Horatiu.show();
	}

}
