package ch03;

public class CastEx {

	public static void main(String[] args) {
		float f = 1.6f; //4바이트
		System.out.println(f);
		
		f=100;
		System.out.println(f);//정수를 실수로 넣어 자동 형변환(float형 실수)을 해주었기 때문에
		
		f = 100.5f;
		int i=(int)f; //실수형이 크기에 강제형변환을 시켜 명시적변환
		System.out.println(i);
	}

}
