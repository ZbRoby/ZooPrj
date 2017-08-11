package com.msg.zooPrj;

import com.msg.zooPrj.command.*;
import com.msg.zooPrj.composite.*;
import com.msg.zooPrj.iterator.*;
import com.msg.zooPrj.singleton.*;

public class ZooPrjMain {
	public static void main(String[] args) {

		Animal allLivingThings, mammal, reptile, shark, dog, cat, snake, lizard;
		allLivingThings = new SpecimenGroupAL("Animalia");

		mammal = new SpecimenGroupAL("Mammal");
		reptile = new SpecimenGroupHT("Reptile");

		shark = new Specimen("Shark", 10);
		dog = new Specimen("Dog", 9);
		cat = new Specimen("Cat", 14);
		snake = new Specimen("Snake", 2);
		lizard = new Specimen("Lizard", 5);

		mammal.add(cat);
		mammal.add(dog);
		reptile.add(lizard);
		reptile.add(snake);
		allLivingThings.add(mammal);
		allLivingThings.add(reptile);
		allLivingThings.add(shark);
		System.out.println(allLivingThings.getInfo());
		Singleton.getInstace().setSpecime(allLivingThings);

		// ---------------------------------------------

		Command stats = new CommandStats(allLivingThings);
		stats.execute();

		Command save = new CommandSave(allLivingThings);
		save.execute();

		// -----------------------------------------------

		ZooWorker Horatiu = new ZooWorker((AnimalIterator) mammal, (AnimalIterator) reptile);
		Horatiu.show();
	}

}
