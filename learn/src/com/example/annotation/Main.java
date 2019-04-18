package com.example.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// IoC Container is started
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/example/annotation/appCxt.xml");

		AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
		System.out.println(accountService);
		accountService.open("Raj", 1000.00);
		
		
		CalculatorService calculatorService = applicationContext.getBean("calculatorService",CalculatorService.class);
		System.out.println(calculatorService);
		

		// IoC Container is stopped
		applicationContext.close();

	}
}
