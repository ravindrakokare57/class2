package BikeAb;

public abstract class Bike {
	Bike() {
		System.out.println("bike created");
			}
abstract void run();
void changeGear() {
	System.out.println("gear change");
}
}
