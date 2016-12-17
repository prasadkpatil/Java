/**
 * 
 */
package org.java.designpattern.singleton;

/**
 * @author Prasad Patil
 *
 */
public class EagerInitializedSingleton {
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
}