package ch04;

import java.util.Scanner;

public class Nested_If_Score {

	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.print("Java 점수 : ");
		score=sc.nextInt();
		char lev = ' ';
		char grade;
		if(score > 87) {
			grade = 'A';
			if(score >= 91) {
				lev = '+';
			}else if(score == 90) {
				lev = '0';
			}else if(score > 87) {
				lev = '-';
			}
		}else if(score > 75) {
			grade = 'B';
			if(score >= 81) {
				lev = '+';
			}else if(score == 80) {
				lev = '0';
			}else if(score > 75) {
				lev = '-';
			}
		}else {
			grade ='F';
			System.out.println("재수강 대상입니다.");
		}
		
		System.out.println("당신의 점수는 " + score + "이고 등급은 " + grade + lev + " 입니다.");
}
}
