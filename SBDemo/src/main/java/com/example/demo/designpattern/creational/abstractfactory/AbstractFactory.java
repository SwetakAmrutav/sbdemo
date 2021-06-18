package com.example.demo.designpattern.creational.abstractfactory;

public class AbstractFactory {
	public static AbstractShape getShapeCategory(boolean isRounded) {
		if (isRounded) {
			return new RoundedShapeFactory();
		} else {
			return new SquaredShapeFactory();
		}
	}
}
