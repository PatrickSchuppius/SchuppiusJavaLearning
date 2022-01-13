package InnerClasses;


public class InnerClassesMain {

	public static void main(String[] args) {

		// Wichtig: erst eine Instanz der äußeren Klasse erzeugen,
		// DANN für diese Instanz eine Instanz der inneren Klasse:
		Gearbox mcLaren = new Gearbox(6);
		Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
		System.out.println(first.driveSpeed(1000));

		System.out.println("==========end version 1 =================");

		GearboxV2 mercedes = new GearboxV2(6);
		// mercedes.addGear(1, 5.3);
		// mercedes.addGear(2, 10.6);
		// mercedes.addGear(3, 15.9);
		mercedes.operateClutch(true);
		mercedes.changeGear(1);
		mercedes.operateClutch(false);
		System.out.println(mercedes.wheelSpeed(1000));
		mercedes.changeGear(2);
		System.out.println(mercedes.wheelSpeed(3000));
		mercedes.operateClutch(true);
		mercedes.changeGear(3);
		mercedes.operateClutch(false);
		System.out.println(mercedes.wheelSpeed(6000));

	}

}
