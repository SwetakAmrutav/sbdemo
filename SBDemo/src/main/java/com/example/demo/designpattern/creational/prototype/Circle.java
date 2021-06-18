package com.example.demo.designpattern.creational.prototype;

import com.example.demo.util.Constants;

public class Circle extends ShapePrototype {

	public Circle() {
		type = Constants.CIRCLE;
	}

	@Override
	public void drawShape() {
		System.out.println("Drawing Circle");

	}

}
