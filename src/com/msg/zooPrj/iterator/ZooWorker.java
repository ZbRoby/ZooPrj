package com.msg.zooPrj.iterator;

import java.util.Iterator;

import com.msg.zooPrj.composite.Animal;
import com.msg.zooPrj.singleton.ZooLog;

	/*
	 * this class uses the iterator design pattern to display
	 *  the content of an ArrayList and HashMap
	 * 
	 * 
	 * */


public class ZooWorker {
	private AnimalIterator am;
	private AnimalIterator ar;

	public ZooWorker(AnimalIterator am, AnimalIterator ar) {
		this.am = am;
		this.ar = ar;
		ZooLog.logger.trace("The zoo worker has been created!");
	}

	public void show() {
		Iterator<?> iam = am.createIterator();
		Iterator<?> iar = ar.createIterator();
		System.out.println("Mammal:");
		display(iam);
		System.out.println("Reptile:");
		display(iar);
	}

	public void display(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			Animal animal = (Animal) iterator.next();
			System.out.println("Animal is :" + animal);
		}
	}

}
