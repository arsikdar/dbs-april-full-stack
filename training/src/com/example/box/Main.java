package com.example.box;

public class Main {

	public static void main(String[] args) {

		int i = 10;
		Integer it1 = new Integer(i); // explicit boxing

		// Java 5
		int j = 10;
		Integer it2 = j; // auto boxing
		
		
		int x = it1.intValue(); // explicit unboxing
		
		// Java 5
		int y = it1;  // auto unboxing
		
		System.out.println(it1.getClass());
		System.out.println(it2.getClass());

		System.out.println(it1 instanceof Integer);
		System.out.println(it2 instanceof Integer);
		
		
		
	}
}
