package com.msg.zooPrj.singleton;

import org.junit.Test;
/* testing SingletonEnum */
import junit.framework.TestCase;

public class SingletonEnumTest extends TestCase {

	@Test
	public void test() {

		SingletonEnum e1 = SingletonEnum.INSTANCE;
		SingletonEnum e2 = SingletonEnum.INSTANCE;

		assertEquals(e1.hashCode(), e2.hashCode());

	}

}