package SecondStepsClassesConstructorsInheritance.composition;


public class Room {

	private Window window;

	public Room() {
		this.window = new Window(2, 3);
	}

	public void lüften() {
		this.getWindow().open();
	}

	private Window getWindow() {
		return window;
	}

}
