package org.java.designpattern.singleton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	/*
	 * This method will reduce performance of the application. Because each
	 * thread will wait for acquiring the lock to get new instance.
	 * 
	 * public static synchronized ThreadSafeSingleton getInstance(){
	 *  	if(instance == null){
	 *  		instance = new ThreadSafeSingleton();
	 *  	} 
	 *  return instance;
	 *  }
	 *  
	 */

	public static ThreadSafeSingleton getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
