package com.example.demo.designpattern.creational.prototype;

public abstract class ShapePrototype implements Cloneable {

	private String id;
	protected String type;
	
	public abstract void drawShape();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}
	
	public Object shapeClone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
}
