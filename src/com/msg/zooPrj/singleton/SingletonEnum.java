package com.msg.zooPrj.singleton;

import com.msg.zooPrj.composite.Animal;

/*Singleton Design Pattern Enum variation    */

public enum SingletonEnum {
	INSTANCE;

	private Animal specime;

	public void setSpecime(Animal allLivingThings) {
		this.specime = allLivingThings;
	}
	public Animal getSpecime() {
		return specime;
	}
}
