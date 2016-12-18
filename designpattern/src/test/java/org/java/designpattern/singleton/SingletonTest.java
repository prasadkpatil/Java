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
	
	@Test
	public void testLazyInitializedSingleton() {
		LazyInitializedSingleton firstInstance = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton secondInstance = LazyInitializedSingleton.getInstance();
		
		assertEquals("Two objects are different", firstInstance, secondInstance);
	}
	
	@Test
	public void testThreadSafeSingleton() {
		ThreadSafeSingleton firstInstance = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton secondInstance = ThreadSafeSingleton.getInstance();
		
		assertEquals("Two objects are different", firstInstance, secondInstance);
	}
	
	@Test
	public void testStaticBlockInitializedSingleton() {
		StaticBlockInitializedSingleton firstInstance = StaticBlockInitializedSingleton.getInstance();
		StaticBlockInitializedSingleton secondInstance = StaticBlockInitializedSingleton.getInstance();
		
		assertEquals("Two objects are different", firstInstance, secondInstance);
	}

}
