package com.test.java8.optional.day07;

import java.util.Optional;

public class NewMan {
   private Optional<Goddess> goddess = Optional.empty();
   
   public NewMan() {
		super();
	}
   public NewMan(Optional<Goddess> goddess) {
		super();
		this.goddess = goddess;
	}

	public Optional<Goddess> getGoddess() {
		return goddess;
	}

	public void setGoddess(Optional<Goddess> goddess) {
		this.goddess = goddess;
	}

	
	@Override
	public String toString() {
		return "Man [goddess=" + goddess + "]";
	}
}
