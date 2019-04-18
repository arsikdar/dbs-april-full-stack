class Bus extends Vehicle implements Brakable,Repairable {

	public void start() {
		System.out.println("Bus engine started with button press!!!!");
	}

	public void speedDown() {
		System.out.println("Bus is slowing down!!!!");
	}

	public void repair() {
		System.out.println("Bus is being repaired!!!!");
	}


}