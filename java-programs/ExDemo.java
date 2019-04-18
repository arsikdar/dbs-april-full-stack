class ExDemo {
	public static void main(String[] args) {

		try {	

			CinemaService cinemaService = new CinemaService();
			cinemaService.watchMovie(34);
			cinemaService.watchMovie(20);
			cinemaService.watchMovie(12);
			cinemaService.watchMovie(4);

			Integer it = new Integer(1000);
			it.intValue();
				
			int[] numbers = new int[5];
			numbers[0] = 120;
			numbers[2] = 720;
			numbers[4] = 920;

			int i = 10;
			int j = 2;
			int rs = i/j;

			System.out.println(rs);
			System.out.println("Done!!!!");	
			

		} catch(ArithmeticException ex) {
			System.out.println("ArithmeticException handled!!!!!");
			System.out.println(ex.getMessage());
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException handled!!!!!");
			System.out.println(ex.getMessage());
		} catch(NullPointerException ex) {
			System.out.println("NullPointerException handled!!!!!");
			System.out.println(ex.getMessage());
		} catch(Exception ex) {
			System.out.println("Exception handled!!!!!");
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("I am the boss!!!!!");
		}
		//1000 loc
	}
}