package ch06;

public class MethodEx2 {
//메소드를 사용하면 얻을 수 있는 장점
	//중복 코드를 줄이고 코드를 재사용
	//보기좋다
	public static void main(String[] args) {
		System.out.println("합(1~10) :"+sum(1,10));
		System.out.println("합(1~100) :"+sum(1,100));
		System.out.println("합(1~1000) :"+sum(1,1000));
	}
	public static int sum	(int a, int b) {
		int sum=0;
		for(int i=a; i<=b; i++) {
			sum +=i;
		}
		return sum;
	}
}
