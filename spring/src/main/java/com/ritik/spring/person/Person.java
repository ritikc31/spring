package com.ritik.spring.person;

public class Person {
	private String name;
	
	public void speak() {
		System.out.println("Hello...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
