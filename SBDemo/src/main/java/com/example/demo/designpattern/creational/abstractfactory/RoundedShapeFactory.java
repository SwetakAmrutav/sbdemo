package com.example.demo.designpattern.creational.abstractfactory;

import com.example.demo.designpattern.creational.factory.Circle;
import com.example.demo.designpattern.creational.factory.Elipse;
import com.example.demo.designpattern.creational.factory.Shape;
import com.example.demo.util.Constants;

public class RoundedShapeFactory implements AbstractShape {

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase(Constants.CIRCLE)) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase(Constants.ELIPSE)) {
			return new Elipse();
		}
		return null;
	}

}
