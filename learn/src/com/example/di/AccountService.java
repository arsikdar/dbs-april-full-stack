package com.example.di;

public class AccountService {

	String title;
	String location;

	public AccountService() {
		System.out.println("Inside AccountService()!!!!!");
		this.title = "Simple Account Service";
		this.location = "Karol Bagh";
	}

	public AccountService(String title) {
		System.out.println("Inside AccountService(String title)!!!!!");
		this.title = title;
		this.location = "Karol Bagh";
	}

	public AccountService(String title, String location) {
		System.out.println("Inside AccountService(String title, String location)!!!!!");
		this.title = title;
		this.location = location;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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
