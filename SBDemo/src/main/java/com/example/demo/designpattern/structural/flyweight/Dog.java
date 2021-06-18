package com.example.demo.designpattern.structural.flyweight;

public class Dog implements Animal {

	private String name = null;

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public void printAnimalAttributes() {
		System.out.println("Name of Animal:" + this.name);
		System.out.println("Number of Eyes:" + CommonAnimalProperties.eyes);
		System.out.println("Number of Nose:" + CommonAnimalProperties.nose);
		System.out.println("Number of Legs:" + CommonAnimalProperties.legs);
		System.out.println("Number of Tail:" + CommonAnimalProperties.tail);

	}

}
