package com.msg.zooPrj;

import com.msg.zooPrj.command.Command;
import com.msg.zooPrj.command.CommandSave;
import com.msg.zooPrj.command.CommandStats;
import com.msg.zooPrj.composite.Animal;
import com.msg.zooPrj.composite.Specimen;
import com.msg.zooPrj.composite.SpecimenGroupAL;
import com.msg.zooPrj.composite.SpecimenGroupHT;
import com.msg.zooPrj.iterator.AnimalIterator;
import com.msg.zooPrj.iterator.ZooWorker;
import com.msg.zooPrj.singleton.SingletonEnum;

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
		// Singleton.getInstace().setSpecime(allLivingThings);
		SingletonEnum.INSTACE.setSpecime(allLivingThings);

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
