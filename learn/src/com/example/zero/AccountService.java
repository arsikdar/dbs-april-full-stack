package com.example.zero;

import org.springframework.beans.factory.annotation.Autowired;

public class AccountService {
	
	@Autowired
	AccountDAO accountDAO;
	
	public AccountService() {
		System.out.println("Inside AccountService()!!!!!");
	}
	
	public long open(String name, double initialAmount) {
		System.out.printf("Hello Mr. %s, your account is opened and initial balance is %s.%n", name, initialAmount);
		return accountDAO.save();
	}

	public boolean close(long accountNo) {
		System.out.printf("Account No. %s is closed.%n", accountNo);
		return accountDAO.delete();
	}
}
