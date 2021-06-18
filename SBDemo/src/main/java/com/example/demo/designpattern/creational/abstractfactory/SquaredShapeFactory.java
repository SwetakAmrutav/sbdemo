package com.example.demo.designpattern.creational.abstractfactory;

import com.example.demo.designpattern.creational.factory.Rectangle;
import com.example.demo.designpattern.creational.factory.Shape;
import com.example.demo.designpattern.creational.factory.Square;
import com.example.demo.util.Constants;

public class SquaredShapeFactory implements AbstractShape {

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase(Constants.SQUARE)) {
			return new Square();
		} else if (shapeType.equalsIgnoreCase(Constants.RECTANGLE)) {
			return new Rectangle();
		}
		return null;
	}

}
