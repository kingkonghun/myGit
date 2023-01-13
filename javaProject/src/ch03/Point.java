package ch03;

import java.util.Scanner;

public class Point {

	public static void main(String[] args) {
		//변수선언
		String name;
		int kor, eng, mat, tot;
		double avg;
		
		//입력객체 생성
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next();//문자열 입력
		System.out.print("국어 : ");
		kor = scan.nextInt();
		System.out.print("영어 : ");
		eng = scan.nextInt();
		System.out.print("수학 : ");
		mat = scan.nextInt();
		scan.close();
		
		//계산
		tot = kor+eng+mat;
		avg = tot/3.0;
		
		//결과 출력
		System.out.println("이름\t국어\t영어\t수학\t총정\t평균");//\t는 띄어쓰기
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f",  name, kor, eng, mat, tot, avg);//.1f 소수점 첫째자리까지 표현할때
		System.out.println();
		System.out.println(String.format("%s\t%d\t%d\t%d\t%d\t%.1f",  name, kor, eng, mat, tot, avg));
		//ln형태로 쓰고 싶을때
	}

}
