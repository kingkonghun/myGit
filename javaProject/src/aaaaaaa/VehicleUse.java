package aaaaaaa;

public class VehicleUse {
	public static void main(String[] args) {
		Vehicle c = new Car();
		c.speedUp();
		c.speedDown();
		c.handle();
		System.out.println();
		Vehicle a = new Plane();
		a.speedUp();
		a.speedDown();
		a.handle();
		System.out.println();
		Vehicle b = new Boat();
		b.speedUp();
		b.speedDown();
		b.handle();
	}
}
