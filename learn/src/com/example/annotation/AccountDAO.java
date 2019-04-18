package com.example.annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("dao")
@Repository
public class AccountDAO {
	
	public AccountDAO() {
		System.out.println("Inside AccountDAO()!!!!!");
	}

	public long save() {
		System.out.println("Account Details saved in DB!!!!!");
		return (long) (Math.random() * 5000);
	}

	public boolean delete() {
		System.out.println("Account deleted from DB!!!!!");
		return true;
	}
}
