package com.msg.zooPrj.singleton;

import com.msg.zooPrj.composite.Animal;

/*@author daniel
 * Singleton Design Pattern Enum variation    */

public enum SingletonEnum {
	INSTANCE;

	private Animal specimen;

	public void setSpecime(Animal allAnimals) {
		this.specimen = allAnimals;
	}

	public Animal getSpecime() {
		return specimen;
	}

}
