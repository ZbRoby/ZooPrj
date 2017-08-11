package com.msg.zooPrj.singleton;

import org.junit.Test;

import com.msg.zooPrj.composite.Animal;

public class SingletonEnumTest {

	@Test
	public void testHashcode() {
		Animal animal1 = null;
		Animal animal2 = null;

		SingletonEnum.INSTANCE.setSpecime(animal1);

	}

}
