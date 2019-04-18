package com.example.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// IoC Container is started
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/example/ioc/appCxt.xml");

		// User 1
		AccountService accountService1 = (AccountService) applicationContext.getBean("accountService");
		System.out.println(accountService1);

		// User 2
		AccountService accountService2 = (AccountService) applicationContext.getBean("accountService");
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
