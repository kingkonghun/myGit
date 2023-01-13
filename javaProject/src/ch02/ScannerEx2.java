package ch02;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//스캐너 객체 생성 키보드로 값을 입력 가능
		System.out.print("이름을 입력하세요 :");
		String name = scan.next();//문자열 입력 string
		System.out.print("나이를 입력하세요 :");
		short age = scan.nextShort();//정수 입력
		System.out.print("현재 가진 현금의 금액을 입력하세요 :");
		int money =scan.nextInt(); //정수입력
		System.out.print("집에서 직장까지의 거리를 m 단위로 입력하세요 :");
		long distance = scan.nextLong();
		System.out.print("신장(키)를 입력하세요 :");
		float height = scan.nextFloat();//실수값 입력
		System.out.print("몸무게를 입력하세요 :");
		double weight = scan.nextDouble();//실수값 입력
		
		System.out.println("============ :");
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 나이는 " + age + "입니다.");
		System.out.println("당신의 현재cash는 " + money + "입니다.");
		System.out.println("당신의 출근거리는 " + distance + "m 입니다.");
		System.out.println("당신의 신장은 " + height +"입니다.");//정수로 넣었어도 실수로 출력
		System.out.println("당신의 몸무게는 " + weight + "입니다.");
		System.out.println("================");
		
		scan.close();//스킨객체를 종료 클로저를 하므로써 메모리상에서 종료
	}

}
