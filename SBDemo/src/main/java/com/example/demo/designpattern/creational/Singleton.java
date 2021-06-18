package com.example.demo.designpattern.creational;

public class Singleton {

	private static Singleton singleton = new Singleton();

	private Singleton() {
		/*
		 * Cannot instantiate this class using new keyword.
		 */
	}

	public static Singleton getSingleton() {
		/* Eager Loading */
		return singleton;

		/* Lazy Loading */
		/*
		 * if (singleton == null) { singleton = new Singleton(); } else { return
		 * singleton; }
		 */
	}

	public void checkObject() {
		System.out.println("Hashcode of Object is: " + singleton);
	}

}
