package com.bridgelabz.demo;

import java.util.List;

public class Sweet {
	String shape;//constant 
	String colour;//constant
	//String taste;
	int price;   //variable
	//String ingredient;
	List<String> ingredient;//constant 
	String name;
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " [shape=" + shape + ", colour=" + colour + ", price=" + price + ", ingredient=" + ingredient + "]";
	}

}
