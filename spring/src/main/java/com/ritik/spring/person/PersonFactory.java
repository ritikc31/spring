package com.ritik.spring.person;

/*
 * This is the main factory bean for creating person objects
 */
public class PersonFactory {

	/*
	 * factory method in factory bean
	 * this method must be non static
	 * this method must take the
	 * arguments which you are passing as constructor arguments it must have setters
	 * for property which you are passing as property
	 */
	public Person getInstance(int id, String name) {
		System.out.println("Person created using factoty method in factory bean");
		return new Person(id, name);
	}

	/* overridden factory method if you are not passing any constructor argument */
	public Person getInstance() {
		System.out.println("Person created using factoty method in factory bean with no perms");
		return new Person();
	}
}
