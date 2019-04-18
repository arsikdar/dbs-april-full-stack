package com.example.di;

import java.util.ArrayList;
import java.util.List;

public class EmailDAO {
	
	public List<String> select() {
		//DB 10 loc
		List<String> mailInfo = new ArrayList<>();
		mailInfo.add("yahoo.smtp.com");
		mailInfo.add("25");
		return mailInfo;
	}

}
