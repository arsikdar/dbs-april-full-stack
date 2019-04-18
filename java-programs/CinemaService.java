class CinemaService {
		
	void watchMovie(int age) throws Exception {
		if(age < 10) {
			throw new Exception("Go Home as you are too young!!!!");	
		}
		System.out.printf("Hello Mr, Enjoy the movie as you are eligible as ur age is %s.%n",age);
	}	
}