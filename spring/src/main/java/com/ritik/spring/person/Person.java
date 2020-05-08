package com.ritik.spring.person;

import com.ritik.spring.person.address.Address;

public class Person {

	private int id;
	private String name;
	private int taxId;
	private String favouriteColor;
	private Address address;

	public void setAddress(Address address) {
		this.address = address;
	}

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

	public void onCreate() {
		System.out.println("Person Created : " + this);
	}

	public void onDestroy() {
		System.out.println("Person Destroyed : " + this);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", favouriteColor=" + favouriteColor
				+ ", address=" + address + "]";
	}
}
