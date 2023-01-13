package ch11;
//추상클래스를 쓰느느 이유는 표준화(유지보수의 이유)때문
//추상클래스를 인스턴스를 만들 수 없음
//추상 메소드를 자식클래스에서 구현해야 한다.
public class AbstractExtends extends AbstractClass {

	@Override
	void method1() {
		System.out.println("추상 method를 완성한 method");
		
	}
	public static void main(String[] args) {
		//abstractclass a =new Abstractclass(); 추상클래스는 객체생성이 안된다
		AbstractExtends ex =new AbstractExtends();
		ex.method1();
		ex.method2();
	}
}
