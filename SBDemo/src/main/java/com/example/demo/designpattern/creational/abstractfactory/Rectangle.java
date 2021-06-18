package com.example.demo.designpattern.creational.abstractfactory;

import com.example.demo.designpattern.creational.factory.Shape;

public class Rectangle implements Shape {

	@Override
	public void drawShape() {
		System.out.println("Drawing Rectangle");

	}

}
