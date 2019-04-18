package com.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		new ListDemo();
	}

	public ListDemo() {
		// UC1();
		// UC2();
		// UC3();
		// UC4();
		// UC5();
		// UC6();
		// UC7();
		UC8();

	}

	private void UC8() {

		List<Integer> numbers = new LinkedList<>();

		numbers.add(1000);
		numbers.add(5000);
		numbers.add(6000);
		numbers.add(1700);
		numbers.add(1800);

		System.out.printf("SIZE : %s%n", numbers.size());
		System.out.printf("LIST : %s%n", numbers);

		Integer val1 = numbers.get(2);
		System.out.println(val1);

		int val2 = numbers.get(2);
		System.out.println(val2);

		System.out.println("===================================");

		for (Integer value : numbers) {
			System.out.println(value.intValue() + 10000);
		}

		System.out.println("===================================");

		for (int value : numbers) {
			System.out.println(value + 10000);
		}

		System.out.println("===================================");

		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			int val = iterator.next();
			System.out.println(val);
		}

	}

	private void UC7() {

		List<Integer> numbers = new ArrayList<>(10);

		numbers.add(1000);
		numbers.add(5000);
		numbers.add(6000);
		numbers.add(1700);
		numbers.add(1800);

		System.out.printf("SIZE : %s%n", numbers.size());
		System.out.printf("LIST : %s%n", numbers);

		Integer val1 = numbers.get(2);
		System.out.println(val1);

		int val2 = numbers.get(2);
		System.out.println(val2);

		System.out.println("===================================");

		for (Integer value : numbers) {
			System.out.println(value.intValue() + 10000);
		}

		System.out.println("===================================");

		for (int value : numbers) {
			System.out.println(value + 10000);
		}

		System.out.println("===================================");

		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			int val = iterator.next();
			System.out.println(val);
		}

	}

	private void UC6() {

		List list = new ArrayList(10);

		list.add(10);
		list.add(10000L);
		list.add(100.00F);
		list.add(true);
		list.add("Hello");
		list.add(new Car());
		list.add("Hello");
		list.add(100.00F);
		list.add(true);
		list.add(false);

		System.out.printf("SIZE : %s%n", list.size());
		System.out.printf("LIST : %s%n", list);

		Object val1 = list.get(0);
		System.out.println(val1);

		Integer val2 = (Integer) list.get(0);
		System.out.println(val2);
		System.out.println(val2.intValue());

		int val3 = (Integer) list.get(0);
		System.out.println(val3);

	}

	private void UC5() {

		List list = new ArrayList(10);

		list.add(new Integer(1000));
		list.add(new Long(10000L));
		list.add(new Float(100.00F));
		list.add(new Boolean(true));
		list.add(new String("Hello"));
		list.add(new Car());
		list.add(new Car());
		list.add(new String("Hello"));
		list.add(new Float(100.00F));
		list.add(new Boolean(true));
		list.add(new Boolean(false));

		int length = list.size();

		for (int idx = 0; idx < length; idx++) {
			System.out.println(list.get(idx));
		}

		System.out.println("===================================");

		for (int idx = length - 1; idx >= 0; idx--) {
			System.out.println(list.get(idx));
		}

		System.out.println("===================================");

		for (Object value : list) {
			System.out.println(value);
		}

		System.out.println("===================================");

		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	private void UC4() {

		List list = new ArrayList(10);

		list.add(new Integer(1000));
		list.add(new Long(10000L));
		list.add(new Float(100.00F));
		list.add(new Boolean(true));
		list.add(new String("Hello"));
		list.add(new Car());
		list.add(new Car());
		list.add(new String("Hello"));
		list.add(new Float(100.00F));
		list.add(new Boolean(true));
		list.add(new Boolean(false));

		System.out.printf("SIZE : %s%n", list.size());
		System.out.println(list);

		list.remove(4);
		list.remove(new Float(100.00F));
		list.clear();

		System.out.printf("SIZE : %s%n", list.size());
		System.out.println(list);
	}

	private void UC3() {

		List list = new ArrayList(10);

		list.add(new Integer(1000));
		list.add(new Long(10000L));
		list.add(new Float(100.00F));
		list.add(new Boolean(true));
		list.add(new String("Hello"));
		list.add(new Car());
		list.add(new Car());
		list.add(new String("Hello"));
		list.add(new Float(100.00F));
		list.add(new Boolean(true));
		list.add(new Boolean(false));

		System.out.printf("SIZE : %s%n", list.size());
		System.out.println(list);

		list.set(3, new String("Hi"));

		System.out.println(list);
	}

	private void UC2() {

		List list = new ArrayList(10);

		list.add(new Integer(1000));
		list.add(new Long(10000L));
		list.add(new Float(100.00F));
		list.add(new Boolean(true));
		list.add(new String("Hello"));
		list.add(new Car());
		list.add(new Car());
		list.add(new String("Hello"));
		list.add(new Float(100.00F));
		list.add(new Boolean(true));
		list.add(new Boolean(false));

		System.out.printf("SIZE : %s%n", list.size());
		System.out.println(list.get(7));

		Object val1 = list.get(7);
		System.out.println(val1);

		Integer val2 = (Integer) list.get(0);
		System.out.println(val2);
		System.out.println(val2.intValue() + 10);

	}

	private void UC1() {

		List list = new ArrayList(10);

		System.out.printf("SIZE : %s%n", list.size());

		list.add(new Integer(1000));
		list.add(new Long(10000L));
		list.add(new Float(100.00F));
		list.add(new Boolean(true));
		list.add(new String("Hello"));
		list.add(new Car());
		list.add(new Car());
		list.add(new String("Hello"));
		list.add(new Float(100.00F));
		list.add(new Boolean(true));
		list.add(new Boolean(false));

		list.add(2, new Boolean(true));

		System.out.printf("SIZE : %s%n", list.size());
		System.out.printf("LIST : %s%n", list);

	}

}
