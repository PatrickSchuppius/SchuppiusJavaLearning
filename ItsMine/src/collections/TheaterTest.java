package collections;


public class TheaterTest {

	public static void main(String[] args) {

		Theater theater = new Theater("Staatsoper", 8, 12);
		// theater.getSeats();
		theater.reserveSeat("A10");
		theater.reserveSeat("B25");
		theater.reserveSeat("A10");

		if (theater.reserveSeat("H11")) {
			System.out.println("Please pay");
		} else {
			System.out.println("Sorry, seat is taken");
		}
		if (theater.reserveSeat("H11")) {
			System.out.println("Please pay");
		} else {
			System.out.println("Sorry, seat is taken");
		}

	}

}
