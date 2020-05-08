package com.ritik.spring.person;

import java.util.List;

public class Person {
	private String name;
	private List<String> favouritFruits;

	public Person(String name, List<String> favouritFruits) {
		super();
		this.name = name;
		this.favouritFruits = favouritFruits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getFavouritFruits() {
		return favouritFruits;
	}

	public void setFavouritFruits(List<String> favouritFruits) {
		this.favouritFruits = favouritFruits;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", favouritFruits=" + favouritFruits + "]";
	}

}
