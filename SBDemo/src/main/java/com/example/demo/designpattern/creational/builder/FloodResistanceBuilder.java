package com.example.demo.designpattern.creational.builder;

public class FloodResistanceBuilder implements Builder {

	private Home floodResistanceHome = new Home();

	@Override
	public void buildFloor() {

		this.floodResistanceHome.floor = "10 feet above ground level";

	}

	@Override
	public void buildWalls() {
		this.floodResistanceHome.wall = "water resistance walls";

	}

	@Override
	public void buildTerrace() {
		this.floodResistanceHome.terrace = "water leakage resistance terrace";

	}

	@Override
	public Home getComplexhomeObject() {
		return this.floodResistanceHome;
	}

}
