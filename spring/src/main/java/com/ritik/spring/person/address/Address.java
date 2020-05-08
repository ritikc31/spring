package com.ritik.spring.person.address;

public class Address {

	private String street;
	private int postCode;

	public void setStreet(String street) {
		this.street = street;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public void onCreate() {
		System.out.println("Address Created : " + this);
	}

	public void onDestroy() {
		System.out.println("Address Destroyed : " + this);
	}
	
	public void create() {
		System.out.println("Address Created(default) : " + this);
	}

	public void destroy() {
		System.out.println("Address Destroyed(default) : " + this);
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postCode=" + postCode + "]";
	}

}
