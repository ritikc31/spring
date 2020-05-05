package com.ritik.spring.person;

public class Person {

	private int id;
	private String name;
	private int taxId;
	private String favouriteColor;

	// we must follow camelCase naming convention for field and setters
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setFavouriteColor(String favouriteColor) {
		this.favouriteColor = favouriteColor;
	}

	// for creating bean with no constructor args defined
	public Person() {
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void speak() {
		System.out.println("Hello...");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", favouriteColor=" + favouriteColor + "]";
	}
}
