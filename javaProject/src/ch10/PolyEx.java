package ch10;

public class PolyEx {

	public static void main(String[] args) {
		int a=10;
		double b=20.1;
		char c = 'A';
		String d="hello";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
//object 는 최상위클래스 모든 타입을 다룰 수 있다.
		//그대로 사용하면 무거워지며 속도저하
		//한개의 자료형으로 다양한 형태의 자료형을 처리할 수 있는 능력을 다형성이라 한다.
		Object o=21;
		System.out.println(o);
	}

}
