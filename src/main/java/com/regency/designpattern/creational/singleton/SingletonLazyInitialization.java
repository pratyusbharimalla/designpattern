/**
 * 26-Oct-2019
 *
 * desinpattern
 *
 * com.regency.designpattern.creational.singleton
 *
 * SingletonLazyInitialization.java
 *
 * @author : Pratyus
 */
package com.regency.designpattern.creational.singleton;

/**
 * @author : Pratyus
 *
 */
public class SingletonLazyInitialization {

private static SingletonLazyInitialization instance;
	
	private String message;
	
	private SingletonLazyInitialization() {
		message = "Hello Singleton class";
	}
	
	private static SingletonLazyInitialization getInstance() {
		if( instance == null )
			return new SingletonLazyInitialization();
		return instance;
	}
	
	public static void main(String[] args) {
		
		//Test the singleton impelmentation
		SingletonLazyInitialization object1 = SingletonLazyInitialization.getInstance();
		SingletonLazyInitialization object2 = SingletonLazyInitialization.getInstance();
		
		System.out.println("Object 1 message : " + object1.message);
		System.out.println("Object 2 message : " + object2.message);
		
		object1.message = (object1.message).toUpperCase();
		
		System.out.println("\nObject 1 message after modification : " + object1.message);
		System.out.println("Object 2 message after modification : " + object2.message);
		
	}
}
