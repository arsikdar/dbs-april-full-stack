package com.example.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		new SetDemo();
	}

	public SetDemo() {
		UC1();
	}

	private void UC1() {

		//Set<Integer> numbers = new HashSet<>();
		Set<Integer> numbers = new TreeSet<>();

		numbers.add(1000);
		numbers.add(5000);
		numbers.add(6000);
		numbers.add(1700);
		numbers.add(1800);
		numbers.add(6000);
		
		System.out.printf("SIZE : %s%n", numbers.size());
		System.out.printf("SET : %s%n", numbers);

		numbers.remove(1700);
	
		System.out.printf("SET : %s%n", numbers);

		System.out.println("===================================");

		for (int value : numbers) {
			System.out.println(value);
		}

		System.out.println("===================================");

		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			int val = iterator.next();
			System.out.println(val);
		}

	}

}
