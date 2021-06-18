package com.example.demo.designpattern.creational.prototype;

import com.example.demo.util.Constants;

public class Rectangle extends ShapePrototype {

	public Rectangle() {
		type = Constants.RECTANGLE;
	}

	@Override
	public void drawShape() {
		System.out.println("Drawing Rectangle");
	}

}
