package com.msg.zooPrj.singleton;

import com.msg.zooPrj.composite.Animal;

public enum SingletonEnum {
	INSTACE;

	private Animal specime;

	public void setSpecime(Animal allLivingThings) {
		this.specime = allLivingThings;
	}
}
