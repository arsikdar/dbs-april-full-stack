package com.example.ioc;

public class AccountService {
	
	public AccountService() {
		System.out.println("Inside AccountService()!!!!!");
	}

	public long open(String name, double initialAmount) {
		System.out.printf("Hello Mr. %s, your account is opened and initial balance is %s.%n", name, initialAmount);
		return (long) (Math.random() * 5000);
	}

	public boolean close(long accountNo) {
		System.out.printf("Account No. %s is closed.%n", accountNo);
		return true;
	}
}
