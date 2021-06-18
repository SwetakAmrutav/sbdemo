package com.example.demo.designpattern;

import com.example.demo.designpattern.structural.ProxySubject;
import com.example.demo.designpattern.structural.Subject;
import com.example.demo.designpattern.structural.flyweight.Animal;
import com.example.demo.designpattern.structural.flyweight.AnimalFactory;

public class Structural {

	public static void main(String[] args) {
		/* Proxy */
		System.out.println("---Proxy---");

		Subject subject = new ProxySubject();
		subject.details();

		/* Flyweight */
		System.out.println("---Flyweight---");

		Animal cat = AnimalFactory.getCat("CAT");
		cat.printAnimalAttributes();

		Animal dog = AnimalFactory.getCat("DOG");
		dog.printAnimalAttributes();
	}

}
