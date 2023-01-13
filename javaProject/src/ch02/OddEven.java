package ch02;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int num = in.nextInt();
		System.out.println(num % 2 == 0 ? "짝수" : "홀수");
		//3항 연산자 1항(num을 2로나눈 나머지 값 ==는 비교 연산자 같냐고 물어보는) ? 2항(true 일때) : 3항(false일때 발동)
	    in.close();
	}

}
