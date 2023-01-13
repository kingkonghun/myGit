package ch04;

import java.util.Scanner;

public class My_First_Menu {

	public static void main(String[] args) {
		/*메뉴구성

(1) 한식
  1. 김치찌개
  2. 된장찌개
  3. 삼겹살
  4. 비빔밥
(2) 양식
  1. 돈까스
  2. 비프스테이크
  3. 카레라이스
(3) 중식
  1. 짜장면
  2. 짬뽕
  3. 탕수육
​
출력 결과 예
== [메 뉴] ==                                                                             while사용
(1) 한식 					                                                                   if를 써서 짜보기 
(2) 양식
(3) 중식
원하는 메뉴(1~3)를 선택하세요.(종료:0)>
1

[한식메뉴]  
(1) 김치찌개
(2) 된장찌개
(3) 삼겹살
(4) 비빔밥
한식메뉴를 선택하세요.(한식메뉴선택종료:0, 전체종료:99)>2
>> 고객님은 된장찌개를 선택하셨습니다.  					switch사용 	int manu 
																						case
[한식메뉴]																			sysout"고객님은 ...을 선택하셨습니다."
(1) 김치찌개																			브레이크
(2) 된장찌개
(3) 삼겹살
(4) 비빔밥
한식메뉴를 선택하세요.(한식메뉴선택종료:0, 전체종료:99)>0         for로 if안에서 한번 더 돌기

== [메 뉴] ==
(1) 한식
(2) 양식
(3) 중식
원하는 메뉴(1~3)를 선택하세요.(종료:0)>
0
프로그램을 종료합니다.
프로그램을 모두 종료합니다.*/
		
		Scanner scanner	= new Scanner(System.in);
		exit : //라벨로 탈출
		while(true) {
			System.out.println("== [메 뉴] ==");
			System.out.println("(1) 한식");
			System.out.println("(2) 양식");
			System.out.println("(3) 중식");
			System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0)> ");
			String tmp = scanner.next();
			int sel= Integer.parseInt(tmp);
			if(sel==1) {
				for(;;) {
				System.out.println("[한식메뉴]");
				System.out.println("(1) 김치찌개");
				System.out.println("(2) 된장찌개");
				System.out.println("(3) 삼겹살");
				System.out.println("(4) 비빔밥");
				System.out.println("한식메뉴를 선택하세요.(한식메뉴선택종료:0, 전체종료:99)>0");
				String tmp1 = scanner.next();
				int han= Integer.parseInt(tmp1);
				if(han==0) break;
			    if(han==99) break exit ;
			    switch(han) {
				case 1:
					System.out.println(">>고객님은 김치찌개를 선택하셧습니다.");
					break;
				case 2:
					System.out.println(">>고객님은 된장찌개를 선택하셧습니다.");
					break;
				case 3:
					System.out.println(">>고객님은 삼겹살을 선택하셧습니다.");
					break;
				case 4:
					System.out.println(">>고객님은 비빔밥을 선택하셧습니다.");
					break;
				}
				}
			}	else if(sel==2)	{
				System.out.println("[양식메뉴]");
				System.out.println("(1) 돈까스");
				System.out.println("(2) 스테이크");
				System.out.println("(3) 카레라이스");
				System.out.println("양식메뉴를 선택하세요.(한식메뉴선택종료:0, 전체종료:99)>0");//위와 같이 만들기
			}else if(sel==3) {
				System.out.println("[중식메뉴]");
				System.out.println("(1) 돈까스");
				System.out.println("(2) 스테이크");
				System.out.println("(3) 카레라이스");
				System.out.println("양식메뉴를 선택하세요.(한식메뉴선택종료:0, 전체종료:99)>0");//한식과 같이 만들기
			}else if(sel==0)
				break;
			
	}
		System.out.print("프로그램을 종료합니다.");
		scanner.close();
}
}
