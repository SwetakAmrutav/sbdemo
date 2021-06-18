package com.example.demo.designpattern.creational.builder;

interface Builder {

	void buildFloor();

	void buildWalls();

	void buildTerrace();

	Home getComplexhomeObject();

}
