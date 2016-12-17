package org.java.designpattern.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void testEagerInitializedSingleton() {
		EagerInitializedSingleton firstInstance = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton secondInstance = EagerInitializedSingleton.getInstance();
		
		assertEquals("Two objects are different", firstInstance, secondInstance);
	}

}
