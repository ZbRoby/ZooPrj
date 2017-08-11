package com.msg.zooPrj.singleton;

import com.msg.zooPrj.composite.Animal;

public class Singleton {

	private static Singleton instance = new Singleton();
	private Animal specime;

	public Animal getSpecime() {
		return specime;
	}

	public void setSpecime(Animal allLivingThings) {
		this.specime = allLivingThings;
	}

	private Singleton() {
	}

	public static Singleton getInstace() {

		return instance;
	}

}
