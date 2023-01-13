package aaaaaaa;



public class ControllableDemo {

	public static void main(String[] args) {
		
		
		NoteBook n = new NoteBook();
		n.turnon();
		n.turnOff();
		n.repair();
		Controllable.reset();
	}

}
