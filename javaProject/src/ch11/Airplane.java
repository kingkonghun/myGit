package ch11;

public class Airplane implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Airplan 이륙");

	}

	@Override
	public void fly() {
		System.out.println("Airplan 비행");

	}

	@Override
	public void land() {
		System.out.println("Airplan 착륙");

	}

}
