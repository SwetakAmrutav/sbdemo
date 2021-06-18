package com.example.demo.designpattern.structural.flyweight;

import java.util.HashMap;

public class AnimalFactory {
	private static final HashMap<String, Animal> animalMap = new HashMap<String, Animal>();

	public static Animal getCat(String name) {
		String key = name + "-CAT";

		Animal animal = animalMap.get(key);

		if (animal != null) {
			return animal;
		} else {
			animal = new Cat();
			animal.setName(name);
			animalMap.put(key, animal);
		}

		return animal;
	}
	
	public static Animal getDog(String name) {
		String key = name + "-DOG";

		Animal animal = animalMap.get(key);

		if (animal != null) {
			return animal;
		} else {
			animal = new Dog();
			animal.setName(name);
			animalMap.put(key, animal);
		}

		return animal;
	}

}
