class GeneratorDemo {
	public static void main(String[] args) {
		
		Generator generator = new Generator();

		System.out.println(generator.title);
		//generator.title = "Repeat Number Generator";
		System.out.println(generator.title);

		System.out.println(generator.generate());
		
		IDGenerator idgenerator = new IDGenerator();
		System.out.println(idgenerator.generate());
	
	}	
}