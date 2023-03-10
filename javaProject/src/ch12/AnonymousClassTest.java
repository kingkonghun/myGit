package ch12;

interface RemoteControl {//인터페이스는 인스턴스할 수 없다.
	//추상메소드
	void turnOn();
	void turnOff();
}


public class AnonymousClassTest {
	public static void main(String[] args) {
		RemoteControl ac = new RemoteControl() {//익명클래스
			//추상클래스나 interface는 new해서 객체생성을 못한다.하지만 무명클래스 처리하면
			//자동적으로 interface인 RemoteControl을 무명클래스가 상속받아 오버라이딩 할 수 있다.
			@Override
			public void turnOn() {
				System.out.println("TV turnOn()");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV turnOff()");
			}
		};//무명내부클래스
		ac.turnOn();
		ac.turnOff();
	}

}
