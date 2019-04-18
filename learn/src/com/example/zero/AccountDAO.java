package com.example.zero;

import org.springframework.stereotype.Repository;

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
