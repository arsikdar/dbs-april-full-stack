class Person {
	
	int uid;
	String name;
	String phone;
	String email;	

	Person() {
		System.out.println("Inside Person()!!!!");
		this.uid = 1000;
		this.name = "Jaggu";
		this.phone = "981000000";
		this.email = "jaggu@gmail.com";
	}

	Person(int uid,String name,String phone,String email) {
		this.uid = uid;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}	

	void info() {
		System.out.printf("UID : %s%n",this.uid);
		System.out.printf("NAME : %s%n",this.name);
		System.out.printf("PHONE : %s%n",this.phone);
		System.out.printf("EMAIL : %s%n",this.email);
	}	

	void updateEmail(String email) {
		this.email = email;
		System.out.println("Person Email updated!!!!");
	}
}