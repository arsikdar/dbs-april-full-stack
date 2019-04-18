class Car extends Vehicle implements Acceleratable,Repairable,Washable {

	public void start() {
		System.out.println("Car engine started with voice command!!!!");
	}

	public void speedUp() {
		System.out.println("Car is speeding up!!!!");
	}

	public void repair() {
		System.out.println("Car is being repaired!!!!");
	}

	public void wash() {
		System.out.println("Car is being washed!!!!");
	}

}