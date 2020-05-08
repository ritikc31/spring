package com.ritik.spring;

public class Fruit {
	private String name;
	private Taste taste;

	public Fruit(String name, Taste taste) {
		super();
		this.name = name;
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", taste=" + taste + "]";
	}

}
