package com.example.zero;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		// IoC Container is started
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// User 1
		AccountService accountService1 = applicationContext.getBean("accountService",AccountService.class);
		System.out.println(accountService1);

		accountService1.open("Rohan", 500000.00);
		// User 2
		AccountService accountService2 =  applicationContext.getBean("accountService",AccountService.class);
		System.out.println(accountService2);

		/*
		 * long accountNo = accountService.open("Jaggu", 120000.00);
		 * System.out.printf("Account No : %s%n", accountNo); boolean status =
		 * accountService.close(accountNo); System.out.printf("Account Closed : %s%n",
		 * status);
		 */

		// IoC Container is stopped
		applicationContext.close();

	}
}
