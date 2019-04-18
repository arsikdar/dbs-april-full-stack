package com.example.di;

import java.util.List;

public class EmailService {

	// EmailDAO emailDAO = new EmailDAO();

	EmailDAO emailDAO;

	public void setEmailDAO(EmailDAO emailDAO) {
		this.emailDAO = emailDAO;
	}

	public void send() {
		List<String> info = emailDAO.select();
		System.out.printf("Email is sent to Bill Gates using %s!!!!!%n", info);
	}
}
