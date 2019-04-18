class Main {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person(2000,"Mohan","923901010","mohan@yahoo.com");
		//System.out.println(p1.uid);
	
		p1.info();
		p2.info();
		p2.updateEmail("mohan@gmail.com");
		p2.info();

		Employee e1 = new Employee();
		System.out.println(e1.name);


		e1.info();


		//Employee e2 = new Employee("DBS0001","PL","SW",780000.00,"Bill Gates");
		//Employee e3 = new Employee("DBS0002","Sr Architect","SW",9980000.00,"Bill Gates");

		Employee e2 = new Employee(1,"Rohan","981200000","rohan@gmail.com","DBS0001","PL","SW",780000.00,"Bill Gates");
		Employee e3 = new Employee(2,"Sohan","981204500","sohan@gmail.com","DBS0002","Sr Architect","SW",9980000.00,"Bill Gates");
		
		e2.info();
		e2.updateSalary(0.80);
		e2.info();

		e3.info();
		e3.applyForLeave(200);
		e3.updateSalary(100L);
		e3.info();

		//System.out.println(e3.salary);
		System.out.println("=======================");

		Calculator cal = new Calculator();
		cal.sum(12,2);
		cal.sum(10,12,2);
		cal.sum(10,12.00);
		cal.sum(10.00,2);

	}	
}