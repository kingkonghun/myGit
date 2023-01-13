package ch06;

public class allStackTest2 {
//순서를 한눈에 보기
	public static void main(String[] args) {
			System.out.println("main(String[] args)이 시작되었음");
			firstMethod();
			System.out.println("mainString[] args)이 끝났음.");
	}

	private static void firstMethod() {
		System.out.println("firstMethod()가 시작되었음.");
		secodMethod();
		System.out.println("firstMethod()가 시작되었음.");
		
	}

	private static void secodMethod() {
		System.out.println("secondMethod()가 시작되었음.");
		System.out.println("secondMethod()가 끝났음.");
		
	}

}
