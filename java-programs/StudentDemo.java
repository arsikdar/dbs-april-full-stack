class StudentDemo {
	public static void main(String[] args) {
	
		Student s1 = new Student("Jaggu",45,23);
		Student s2 = new Student("Pintu",80,90);
	
		System.out.println(s1.name);
		System.out.println(s2.name);
	
		System.out.println(s1.MARKS);
		System.out.println(s2.MARKS);
		System.out.println(Student.MARKS);

		
		//s1.info();
		//s2.info();
	}
}