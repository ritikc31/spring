package com.ritik.spring;

public enum Taste {
	
	SOUR("sour"),
	SWEET("sweet"),
	BITTER("bitter"),
	SALTY("salty");
	
	private String taste;

	private Taste(String taste) {
		this.taste = taste;
	}

	public String getTaste() {
		return taste;
	}
	
}
