package com.example.demo.designpattern.creational.prototype;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String, ShapePrototype> shapeMap = new Hashtable<String, ShapePrototype>();

	public static ShapePrototype getShape(String shapeId) {
		ShapePrototype cachedShape = shapeMap.get(shapeId);
		return (ShapePrototype) cachedShape.shapeClone();
	}

	public static void loadShapeCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
