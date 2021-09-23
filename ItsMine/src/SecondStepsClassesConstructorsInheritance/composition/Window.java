package SecondStepsClassesConstructorsInheritance.composition;


public class Window {

	private int height;
	private int width;

	public Window(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	public void open() {
		System.out.println("The window was opened!");
	}

}
