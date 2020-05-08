package com.ritik.spring.person;

import com.ritik.spring.person.address.Address;

public class Person {

	private int id;
	private String name;
	private int taxId;
	private String favouriteColor;
	private Address address;
	
	/* factory method in class 
	 * this method must be static
	 * this method must take the arguments which you are passing as constructor arguments
	 * it must have setters for property which you are passing as property
	 */
	public static Person getInstance(int id, String name) {
		System.out.println("Person created using factoty method");
		return new Person(id, name);
	}
	
	/* overridden factory method if you are not passing any constructor argument*/ 
	public static Person getInstance() {
		System.out.println("Person created using factoty method with no perms");
		return new Person();
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

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
	private Person() {
	}

	/* constructor is marked as private to retrict object creation using it */
	private Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void speak() {
		System.out.println("Hello...");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", favouriteColor=" + favouriteColor
				+ ", address=" + address + "]";
	}
}
