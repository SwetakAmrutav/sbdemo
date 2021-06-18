package com.example.demo.designpattern.creational.abstractfactory;

import com.example.demo.designpattern.creational.factory.Shape;

public class Square implements Shape {

	@Override
	public void drawShape() {
		System.out.println("Drawing Square");

	}

}
