package ch05;

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		int total =0;
		int size;
		
		Scanner scan =new Scanner(System.in);
		System.out.print("성적처리할 학생수를 입력하세요 :");
		size = scan.nextInt();
		int[] scores = new int[size];	
		
		for(int i=0; i<scores.length; i++) {
			System.out.print("성적을 입력하세요 :");
			scores[i]=scan.nextInt();
		}
		for(int i=0; i<scores.length; i++) {
			total += scores[i];
			
		}
		
		System.out.println("총점은 "+ total + "점 입니다.");
		System.out.printf("평균 성적은  %.1f 점 입니다.",(double)total/scores.length);
		scan.close();

	}

}
