package ch07;

public class Radio {
	double channel;
	int volume;
	String name;
	boolean onOff;
	
	void print() {
		System.out.println("["+name+"라디오]");
		while(onOff) {
			System.out.println("라디어가 켜져있습니다.");
			break;
		}while(!onOff) {
			System.out.println("라디오가 꺼져있스비낟.");
			break;
		}
		System.out.println("현재 채널은 " + channel + "입니다.");
	System.out.println("볼륨은"+volume+"입니다.");
	}
}
