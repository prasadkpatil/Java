package org.java.designpattern.singleton;

public class StaticBlockInitializedSingleton {
	private static final StaticBlockInitializedSingleton instance;
	
	static{
		instance = new StaticBlockInitializedSingleton();
	}

	private StaticBlockInitializedSingleton() {
	}

	public static StaticBlockInitializedSingleton getInstance() {
		return instance;
	}
}
