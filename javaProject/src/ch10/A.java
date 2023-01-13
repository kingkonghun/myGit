package ch10;
//static 메모리에 바로 로딩
//non staitc 객체 생성 후에 로딩
//static method에서는 static 안의 로컬변수나 static 으로 정의된 멤버 변수만 사용
public class A {
	String name = "kim";//non static 멤버
	static int n = 20;//static 멤버
	public void print() {
		System.out.println(name);
		System.out.println(n);
	}
	
	public static void main(String[] args) {//static 멤버
		int a =10;
		double b = 20.5;
		System.out.println(a);
		System.out.println(b);
		
		
		A aa = new A();
		System.out.println(aa.name);//non static 멤버는 반드시 객체생성후 접근
		System.out.println(n);

	}

}
