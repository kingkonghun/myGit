package ch06;

public class CallEx {

	//위치는 컨트롤 에프 위아래키, 메인의 위치는 상관없다
		public static void test(int b) {
			System.out.println("test method 호출");
			System.out.println(b);
		}
		public static void main(String[] args) {
			System.out.println("시작");
			int a = 10;
			test(a);
			test2(a);
			System.out.println("끝");
	}
		public static void test2(int a) {
			System.out.println(a);
		}
}
