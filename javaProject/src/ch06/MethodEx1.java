package ch06;

public class MethodEx1 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<10; i++) {
			sum+=i;
		}
		System.out.println("합(1~10) :" + sum);
	
		sum=0;
		for(int i=0; i<=100; i++) {
			sum+=i;
		}
		System.out.println("합(1~100) :" + sum);
}
}
