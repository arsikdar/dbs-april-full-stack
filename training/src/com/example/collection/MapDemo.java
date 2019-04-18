package com.example.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		new MapDemo();
	}

	public MapDemo() {
		// UC1();
		//UC2();
		UC3();
	}

	
	private void UC3() {

		Map<String, Long> cityPopulationMap = new HashMap<>();

		cityPopulationMap.put("Delhi", 8000000L);
		cityPopulationMap.put("Mumbai", 999999000L);
		cityPopulationMap.put("Pune", 700000L);
		cityPopulationMap.put("Hyderabad", 7000000L);
		cityPopulationMap.put("Channai", 4000000L);
		cityPopulationMap.put("Calcutta", 4000000L);
		cityPopulationMap.put("Hyderabad", 9000000L);

		Collection<Long> values = cityPopulationMap.values();		
		
		Iterator<Long> iterator = values.iterator();
		while(iterator.hasNext()) {
			long val = iterator.next();
			System.out.println(val);
		}
		
	}
	private void UC2() {

		Map<String, Long> cityPopulationMap = new HashMap<>();

		cityPopulationMap.put("Delhi", 8000000L);
		cityPopulationMap.put("Mumbai", 999999000L);
		cityPopulationMap.put("Pune", 700000L);
		cityPopulationMap.put("Hyderabad", 7000000L);
		cityPopulationMap.put("Channai", 4000000L);
		cityPopulationMap.put("Calcutta", 4000000L);
		cityPopulationMap.put("Hyderabad", 9000000L);

		Set<String> keys = cityPopulationMap.keySet();		
		
		Iterator<String> iterator = keys.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key);
			System.out.println(cityPopulationMap.get(key));
			
		}
		
	}

	private void UC1() {

		Map<String, Long> cityPopulationMap = new HashMap<>();

		cityPopulationMap.put("Delhi", 8000000L);
		cityPopulationMap.put("Mumbai", 999999000L);
		cityPopulationMap.put("Pune", 700000L);
		cityPopulationMap.put("Hyderabad", 7000000L);
		cityPopulationMap.put("Channai", 4000000L);
		cityPopulationMap.put("Calcutta", 4000000L);
		cityPopulationMap.put("Hyderabad", 9000000L);

		System.out.printf("SIZE : %s%n", cityPopulationMap.size());
		System.out.printf("MAP : %s%n", cityPopulationMap);

		System.out.println(cityPopulationMap.get("Channai"));

		cityPopulationMap.remove("Pune");

		System.out.printf("SIZE : %s%n", cityPopulationMap.size());
		System.out.printf("MAP : %s%n", cityPopulationMap);

	}

}
