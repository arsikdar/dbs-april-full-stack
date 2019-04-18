class Employee extends Person {
		
	String eid;
	String desig;
	String dept;
	private double salary;
	String manager;

	Employee() {
		System.out.println("Inside Employee()!!!!");
	}

	Employee(String eid,String desig,String dept,double salary,String manager) {
		System.out.println("Inside Employee(String eid,String desig,String dept,double salary,String manager)!!!!");
		this.eid = eid;
		this.desig = desig;
		this.dept = dept;
		this.salary = salary;
		this.manager = manager;
	}

	Employee(int uid,String name,String phone,String email,String eid,String desig,String dept,double salary,String manager) {
		super(uid,name,phone,email);
		System.out.println("Inside Employee(String eid,String desig,String dept,double salary,String manager)!!!!");
		this.eid = eid;
		this.desig = desig;
		this.dept = dept;
		this.salary = salary;
		this.manager = manager;
	}
	
	void updateSalary(double percentage) {
		this.salary = this.salary + this.salary*percentage;
		System.out.println("Employee salary updated by percentage!!!!!");
	}	

	void updateSalary(long increment) {
		this.salary = this.salary + increment;
		System.out.println("Employee salary updated by increment!!!!!");
	}	

	void applyForLeave(int days) {
		System.out.printf("%s applied for %s days leave!!!!%n",this.name,days);
	}	

	void assignProject(String projectName) {
		System.out.printf("%s has been assigned %s project!!!!%n",this.name,projectName);
	}	

	void info() {
		super.info();
		System.out.printf("EID : %s%n",this.eid);
		System.out.printf("DESIG : %s%n",this.desig);
		System.out.printf("DEPT : %s%n",this.dept);
		System.out.printf("SALARY : %s%n",this.salary);
		System.out.printf("MANAGER : %s%n",this.manager);
	}	
}