package com.example.demo.java8;

interface Shape {
	void calculateArea(double... a);
}


class Circle {
	public static void main(String[] args) {	
		Shape shape = (double... a)  -> 
		System.out.println("Area of circle is: " + Math.PI * a[0]);
		
		shape.calculateArea(1.55);
	}
	
}

class Rectangle {
	public static void main(String[] args) {	
		Shape shape = (double... a)  -> 
		System.out.println("Area of square is: " + a[0] * a[1]);
		
		shape.calculateArea(1.55, 2.55);
	}
	
}


public class Shapes {

}
