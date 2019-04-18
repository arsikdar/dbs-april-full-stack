package com.example.zero;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.example.zero")
public class AppConfig {

	@Bean
	@Scope("singleton")
	@Lazy
	public AccountService accountService() {
		return new AccountService();
	}
	
	/*@Bean
	public AccountDAO accountDAO() {
		return new AccountDAO();
	}*/

}
