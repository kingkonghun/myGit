package aaaaaaa;

public class NoteBook implements Controllable{

	@Override
	public void turnon() {
		System.out.println("노트북을 켠다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("노트북을 끈다");
	}

}
