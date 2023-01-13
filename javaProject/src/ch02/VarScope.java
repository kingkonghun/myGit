package ch02;

public class VarScope {//클래스
    static int x; //전역변수(멤버(기본할단된 자동초기화),필드) 클래스 안에서
	public static void main(String[] args) {//메소드
		int y=0;//지역변수는 반드시 초기화 해야한다
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);

	}

}
