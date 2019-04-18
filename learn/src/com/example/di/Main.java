package com.example.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// IoC Container is started
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/example/di/appCxt.xml");

		AccountService accountService = applicationContext.getBean("accountService",AccountService.class);
		EmailService emailService = applicationContext.getBean("emailService",EmailService.class);
		CalculatorService calculatorService = applicationContext.getBean("calculatorService",CalculatorService.class);
		
		System.out.println(accountService.title);
		System.out.println(accountService.location);
		
		
		long accountNo = accountService.open("Jaggu", 120000.00);
		System.out.printf("Account No : %s%n", accountNo);
		boolean status = accountService.close(accountNo);
		System.out.printf("Account Closed : %s%n", status);
			
		emailService.send();
		
		calculatorService.sum(10, 2);
		calculatorService.diff(10, 2);
		
		// IoC Container is stopped
		applicationContext.close();

	}
}
