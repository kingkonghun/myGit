package ch10;

public class Test {
	static int a;//staitc member
	int b; //non static member
	void print() {//non static member
		//non static 메소드 에서는 static, non static멤버변수를 모두 쓸 수 있다.
		System.out.println(a);//a는 이미 메모리에 올라와 있기 때문에 문제없다
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		
		//staic 메인에 들어왔으니
		Test t = new Test();
		System.out.println(t.b);
		t=null;//객체의 주소값을 지워버림
		System.out.println(Math.PI);//pi도 static멤버
	}

}
