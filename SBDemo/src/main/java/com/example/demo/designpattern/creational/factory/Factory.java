package com.example.demo.designpattern.creational.factory;

import com.example.demo.util.Constants;

public class Factory {

	public Shape getShape(String type) {
		if (type.equalsIgnoreCase(Constants.SQUARE)) {
			return new Square();
		} else if (type.equalsIgnoreCase(Constants.RECTANGLE)) {
			return new Rectangle();
		}
		return null;
	}
}
