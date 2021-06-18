package com.example.demo.designpattern.structural;

public class RealSubject implements Subject {

	@Override
	public void details() {
		System.out.println("I am the Real Subject. That was the proxy.");

	}

}
