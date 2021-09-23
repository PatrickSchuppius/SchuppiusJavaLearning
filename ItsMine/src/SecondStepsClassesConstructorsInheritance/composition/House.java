package SecondStepsClassesConstructorsInheritance.composition;


public class House {

	private Room room;

	public House() {
		this.room = new Room();
	}

	public Room getRoom() {
		return room;
	}

}
