class ArrayDemo {
	public static void main(String[] args) {
		//UC1();
		//UC2();
		UC3();
	}

	private static void UC3() {
		
		//declaration & initialization & population
		//int[] numbers = new int[] {34,56,12,43,56,78,99,88,77,5,4,12,90,98,70,34};
		int[] numbers = {34,56,12,43,56,78,99,88,77,5,4,12,90,98,70,34};

		
		System.out.println(numbers);
		System.out.println(numbers.length);

		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[9]);
	}



	private static void UC2() {
		
		//declaration & initialization
		int[] numbers = new int[10];

		//population
		numbers[0] = 100;		
		numbers[5] = 500;		
		numbers[9] = 800;		
		
		System.out.println(numbers);
		System.out.println(numbers.length);

		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[9]);
	}

	private static void UC1() {
		
		//declaration
		int[] numbers;

		//initialization
		numbers = new int[10];

		//population
		numbers[0] = 100;		
		numbers[5] = 500;		
		numbers[9] = 800;		
		
		System.out.println(numbers);
		System.out.println(numbers.length);

		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[9]);
	}
}