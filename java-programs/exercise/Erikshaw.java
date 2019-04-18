class Erikshaw extends Vehicle implements Brakable,Repairable {

	public void start() {
		System.out.println("Erikshaw engine started with button press!!!!");
	}

	public void speedDown() {
		System.out.println("Erikshaw  is slowing down!!!!");
	}

	public void repair() {
		System.out.println("Erikshaw  is being repaired!!!!");
	}


}