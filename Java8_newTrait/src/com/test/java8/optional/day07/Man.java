package com.test.java8.optional.day07;

public class Man {
	private Goddess goddess;

	public Man() {
		super();
	}
	
	public Man(Goddess goddess) {
		super();
		this.goddess = goddess;
	}

	public Goddess getGoddess() {
		return goddess;
	}

	public void setGoddess(Goddess goddess) {
		this.goddess = goddess;
	}

	
	@Override
	public String toString() {
		return "Man [goddess=" + goddess + "]";
	}


}
