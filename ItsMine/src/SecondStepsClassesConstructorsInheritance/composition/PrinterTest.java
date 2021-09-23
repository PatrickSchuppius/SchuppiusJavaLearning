package SecondStepsClassesConstructorsInheritance.composition;


public class PrinterTest {

	public static void main(String[] args) {
		Printer printer = new Printer();

		System.out.println(printer.toString());

		printer.fillUpToner(20);

		System.out.println(printer.toString());

		printer.printPage();

		System.out.println(printer.toString());
	}

}
