package ch07;

public class Television {
	//멤버변수(전역변수)
		int channel;//channel=0 이 자동으로 초기화되어 있음. ,channel=7
		int volume;//volume=9
		boolean onOff;//전원상태 boolean은 기본적으로 false로 초기화됨. 
		//onoff=false; onoff= thrue
		//멤버메소드
		void print() {
			System.out.println("채널은 "+ channel + "이고 볼륨은 "+ volume + "입니다.");
		}
		int getChannel() {
			return channel;
		}
		void setChannel(int ch) {
			channel = ch;
		}
}
