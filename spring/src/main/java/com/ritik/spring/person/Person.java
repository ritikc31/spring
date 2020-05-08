package com.ritik.spring.person;

import java.util.List;

import com.ritik.spring.Fruit;

public class Person {
	private String name;
	private List<Fruit> favouritFruits;

	public Person() {
	}

	public Person(String name, List<Fruit> favouritFruits) {
		super();
		this.name = name;
		this.favouritFruits = favouritFruits;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFavouritFruits(List<Fruit> favouritFruits) {
		this.favouritFruits = favouritFruits;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", favouritFruits=" + favouritFruits + "]";
	}

}
