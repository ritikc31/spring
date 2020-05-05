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

	@Override
	public String toString() {
		return "Address [street=" + street + ", postCode=" + postCode + "]";
	}

}
