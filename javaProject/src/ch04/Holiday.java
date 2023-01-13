package ch04;

import java.util.Scanner;

public class Holiday {

	public static void main(String[] args) {
		//변수선언
		int year;//근속연수
		int days;//휴가일수
		//입력
		Scanner scan = new Scanner(System.in);
		System.out.print("근속연수를 입력하세요 :"	);
		year = scan.nextInt();//키보드로부터 정수값 입력받음
		scan.close();
		//계산
		if(year <= 3) {
			days = 3;
		}else if(year < 10) {
			days =5;
		}else if(year < 20) {
			days = 10;
		}else {//그외의 모든 경우
			days= 20;
		}
		System.out.println("당신의 근속연수는 " + year + "일입니다.");
		System.out.println("휴가일수는 " + days + "일입니다.");
	}

}
