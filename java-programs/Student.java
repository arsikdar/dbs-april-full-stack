class Student {
		
	String name;
	int hindiMarks;
	int englishMarks;
	public final static int MARKS = 500;
	
	Student(String name,int hindiMarks,int englishMarks) {
		this.name = name;
		this.hindiMarks = hindiMarks;
		this.englishMarks = englishMarks;
	}

	void info() {
		System.out.printf("NAME : %s%n",this.name);
		System.out.printf("HINDIMARKS : %s%n",this.hindiMarks);
		System.out.printf("ENGLISHMARKS : %s%n",this.englishMarks);
		System.out.printf("MARKS : %s%n",this.MARKS);
		System.out.println("==================================");
	}	
}