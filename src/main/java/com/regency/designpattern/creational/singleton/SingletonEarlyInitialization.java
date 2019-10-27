/**
 * 26-Oct-2019
 *
 * desinpattern
 *
 * com.regency.designpattern.creational.singleton
 *
 * SingletonEarlyInitialization.java
 *
 * @author : Pratyus
 */
package com.regency.designpattern.creational.singleton;

/**
 * @author : Pratyus
 *
 */
public class SingletonEarlyInitialization {

	private static SingletonEarlyInitialization instance = new SingletonEarlyInitialization();
	
	private String message;
	
	private SingletonEarlyInitialization() {
		message = "Hello Singleton class";
	}
	
	private static SingletonEarlyInitialization getInstance() {
		return instance;
	}
	
	public static void main(String[] args) {
		
		//Test the singleton impelmentation
		SingletonEarlyInitialization object1 = SingletonEarlyInitialization.getInstance();
		SingletonEarlyInitialization object2 = SingletonEarlyInitialization.getInstance();
		
		System.out.println("Object 1 message : " + object1.message);
		System.out.println("Object 2 message : " + object2.message);
		
		object1.message = (object1.message).toUpperCase();
		
		System.out.println("\nObject 1 message after modification : " + object1.message);
		System.out.println("Object 2 message after modification : " + object2.message);
		
	}
}
