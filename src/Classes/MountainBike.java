package Classes;

public class MountainBike extends Bicycle{
	public static void main(String args[]) {
		Bicycle bike = new Bicycle();
		bike.changeCadence(30);
		bike.changeGear(1);
		bike.speedUp(10);
		bike.applyBrakes(2);
		bike.printStates();
	}
}