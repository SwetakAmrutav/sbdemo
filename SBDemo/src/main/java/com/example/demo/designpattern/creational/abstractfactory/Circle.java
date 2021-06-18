package com.example.demo.designpattern.creational.abstractfactory;

import com.example.demo.designpattern.creational.factory.Shape;

public class Circle implements Shape {

	@Override
	public void drawShape() {
		System.out.println("Drawing Circle");

	}

}
