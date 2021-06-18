package com.example.demo.designpattern.creational.builder;

public class EarthquakeResistanceBuilder implements Builder {

	private Home earthquakeResistsnceHome = new Home();

	@Override
	public void buildFloor() {
		this.earthquakeResistsnceHome.floor = "Wooden Floor";

	}

	@Override
	public void buildWalls() {
		this.earthquakeResistsnceHome.wall = "Wooden Wall";

	}

	@Override
	public void buildTerrace() {
		this.earthquakeResistsnceHome.terrace = "Wooden Terrace";

	}

	@Override
	public Home getComplexhomeObject() {
		return this.earthquakeResistsnceHome;
	}

}
