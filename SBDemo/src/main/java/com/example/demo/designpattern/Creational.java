package com.example.demo.designpattern;

import com.example.demo.designpattern.creational.Singleton;
import com.example.demo.designpattern.creational.abstractfactory.AbstractFactory;
import com.example.demo.designpattern.creational.abstractfactory.AbstractShape;
import com.example.demo.designpattern.creational.builder.Director;
import com.example.demo.designpattern.creational.builder.EarthquakeResistanceBuilder;
import com.example.demo.designpattern.creational.builder.Home;
import com.example.demo.designpattern.creational.factory.Factory;
import com.example.demo.designpattern.creational.factory.Shape;
import com.example.demo.designpattern.creational.prototype.ShapeCache;
import com.example.demo.designpattern.creational.prototype.ShapePrototype;

public class Creational {

	public static void main(String[] args) {
		/* Singleton */
		System.out.println("---Singleton---");

		Singleton singletonObj = Singleton.getSingleton();
		singletonObj.checkObject();

		Singleton singletonObj1 = Singleton.getSingleton();
		singletonObj1.checkObject();

		/* Factory */
		System.out.println("---Factory---");

		Factory factory = new Factory();

		Shape shape1 = factory.getShape("rectangle");
		shape1.drawShape();
		Shape shape2 = factory.getShape("square");
		shape2.drawShape();

		/* Abstract Factory */
		System.out.println("---Abstract Factory---");

		AbstractShape abstractShape1 = AbstractFactory.getShapeCategory(false);
		Shape shape3 = abstractShape1.getShape("square");
		shape3.drawShape();

		AbstractShape abstractShape2 = AbstractFactory.getShapeCategory(true);
		Shape shape4 = abstractShape2.getShape("elipse");
		shape4.drawShape();

		/* Prototype */
		System.out.println("---Prototype---");

		ShapeCache.loadShapeCache();

		ShapePrototype clonedShape = (ShapePrototype) ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());
		clonedShape.drawShape();

		ShapePrototype clonedShape2 = (ShapePrototype) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());
		clonedShape2.drawShape();

		/* Builder */
		System.out.println("---Builder---");

		EarthquakeResistanceBuilder earthquakeResistanceBuilder = new EarthquakeResistanceBuilder();

		Director director = new Director(earthquakeResistanceBuilder);
		director.manageRequiredHomeConstruction();
		Home constructedHome = director.getComplexHomeObject();

		System.out.println(constructedHome.floor);
		System.out.println(constructedHome.wall);
		System.out.println(constructedHome.terrace);

	}

}
