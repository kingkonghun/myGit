package ch04;

public class Odd_Even {

	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				sum1+=i; //sum1=sum1=i
			}//if문
		}//for문
		System.out.println("1~10사이의 홀수의 합은?" + sum1);//for문의 영향을 안받기 위해서 출력식을 위치도 중요하다
	
		for(int j=1; j<=10; j++) {
			if(j%2==1) {
				sum2+=j; //sum2=sum2=j
			}//if문
		}//for문
	
	
	
	
	}//main()

}
