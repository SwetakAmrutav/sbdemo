package com.example.demo.designpattern.structural;

public class ProxySubject extends RealSubject{

	@Override
	public void details() {
		System.out.println("I am the Proxy Subject. Authenticating to get the Real.");
		System.out.println("Authenticated.");
		System.out.println("Redirecting to Real Subject.");
		super.details();

	}
}
