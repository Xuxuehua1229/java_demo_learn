package com.test.java8.optional.day07;

public class Goddess {
	private String name;

	public Goddess() {
		super();
	}
	
	public Goddess(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Goddess [name=" + name + "]";
	}

}
