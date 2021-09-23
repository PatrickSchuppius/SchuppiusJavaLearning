package SecondStepsClassesConstructorsInheritance.composition;


public class Printer {

	private int toner;
	private int noPagesPrinted;
	private boolean duplexPossible;

	public Printer() {
		this.toner = 50;
		this.noPagesPrinted = 0;
		this.duplexPossible = false;
	}

	public void fillUpToner(int fillUpValue) {
		if (fillUpValue > 0 && fillUpValue <= 100) {
			this.toner = this.toner + fillUpValue;
			if (toner > 100) {
				this.toner = 100;
			}
			System.out.println("Toner = " + toner);
		} else {
			System.out.println("dat war wohl nix");
		}
	}
	
	public void printPage() {
		this.noPagesPrinted++;
		this.toner -= 5;
		System.out.println("Have printed a page!");
		System.out.println("New toner level = " + toner);
	}

	@Override
	public String toString() {
		return "Printer [toner=" + toner + ", noPagesPrinted=" + noPagesPrinted + ", duplexPossible=" + duplexPossible
				+ "]";
	}

}
