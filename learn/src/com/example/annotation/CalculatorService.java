package com.example.annotation;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

	public void sum(int a, int b) {
		System.out.printf("SUM : %s%n", (a + b));
	}

	public void diff(int a, int b) {
		System.out.printf("DIFF : %s%n", (a - b));
	}
}
