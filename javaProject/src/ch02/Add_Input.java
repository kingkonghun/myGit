package ch02;

import java.util.Scanner;

public class Add_Input {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);//input 그냥 이름 아무거나 쓴거임 참조변수
		 int x;//지역변수
		 int y;
		 int sum;

		 System.out.print("첫 번째 숫자를 입력하세요 :");
		 x = input.nextInt();//정수형으로 값을 받는다.
		 System.out.print("두 번째 숫자를 입력하세요 :");
		 y = input.nextInt();
		 
		 sum = x+y;
		 System.out.println(sum);
		 
		 input.close();//scanner 객체 닫기
	}

}
