package com.test;

public class SingletonExample {
	
	private static SingletonExample instance;
	
	private SingletonExample() {
		
	}
	
	public static SingletonExample getInstance() {
		if(instance == null) {
			synchronized (SingletonExample.class) {
				if(instance == null) {
					instance = new SingletonExample();
				}
			}
		}
		return instance;
	}
	
	void printSomething() {
		System.out.println("Hello I am singleton");
	}

}
