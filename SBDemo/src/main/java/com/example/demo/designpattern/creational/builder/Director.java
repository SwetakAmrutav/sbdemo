package com.example.demo.designpattern.creational.builder;

public class Director {

	private Builder builder;

	public Director(Builder builderType) {
		this.builder = builderType;
	}

	public Home getComplexHomeObject() {
		return this.builder.getComplexhomeObject();
	}

	public void manageRequiredHomeConstruction() {
		this.builder.buildFloor();
		this.builder.buildWalls();
		this.builder.buildTerrace();
	}
}
