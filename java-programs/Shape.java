abstract class Shape {
		
	String title;

	Shape() {
		this.title = "Beautiful Shapes";
	}

	void info() {
		System.out.printf("It is all %s!!!!%n",this.title);
	}

	abstract void draw();
	abstract void paint();
}