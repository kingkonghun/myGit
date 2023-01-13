package ch09;

public class VolumeUse {

	public static void main(String[] args) {
		Volume vol=new Volume();//가봤자 아무것도 없고
		System.out.println("부피 : "+ vol.getVolume());//호출 메소드 호출 겟에어리어 곱한값을 리턴해줘 기본초기값이 0이라 0으로나옴
		Volume vol2=new Volume(10,20,30);
		System.out.println("부피 : "+ vol2.getVolume());

	}

}
