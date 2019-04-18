package com.example.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class AccountService {

	@Autowired
	AccountDAO accountDAO;

	/*@Autowired
	//@Qualifier("dao")
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}*/

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
