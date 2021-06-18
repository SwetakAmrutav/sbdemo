package com.example.demo.designpattern.creational.abstractfactory;

import com.example.demo.designpattern.creational.factory.Shape;

public interface AbstractShape {
	Shape getShape(String shapeType);
}
