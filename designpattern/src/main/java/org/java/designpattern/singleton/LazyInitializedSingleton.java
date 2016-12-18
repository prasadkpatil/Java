package org.java.designpattern.singleton;

/**
 * @author Prasad Patil
 *
 */
public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance = null;

	private LazyInitializedSingleton() {
	}

	public static LazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
}
