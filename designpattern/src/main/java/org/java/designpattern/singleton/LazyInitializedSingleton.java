package org.java.designpattern.singleton;

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
