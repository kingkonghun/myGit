package ch05;

import java.util.Scanner;

public class Arraypoint2 {

	public static void main(String[] args) {
		String[] name = new String[2];
		int[] kor = new int [2];
		int[] eng = new int [2];
		int[] mat = new int [2];
		int[] tot = new int [2];
		double[] avg = new double[2];
		double CAvg = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("2명의 학생의 국,영,수 점수를 각각 입력하세요.");
		for(int i=0; i<2; i++) {
			System.out.print("이름을 입력하세요 : ");
			name[i] = sc.next();
			System.out.print("국어 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어 : ");
			eng[i] = sc.nextInt();
			System.out.print("수학 : ");
			mat[i] = sc.nextInt();
			System.out.println();

			tot[i] = kor[i]+eng[i]+mat[i];
			avg[i] = tot[i]/3.0;
		}
		
		CAvg = (avg[0] + avg[1])/2.0;

		System.out.println();
		System.out.println("[성적 출력]");

		for(int i=0; i<2; i++) {
			System.out.println("이름 : "+ name[i]);
			System.out.println("국어 : "+ kor[i]);
			System.out.println("영어 : "+ eng[i]);
			System.out.println("수학 : "+ mat[i]);
			System.out.println("총점 : "+ tot[i]);
			System.out.println("평균 : "+ String.format("%4.1f",avg[i]));
			System.out.println();			
		  }
		
		System.out.println("=========================");
		System.out.println("학급평균 : "+String.format("%4.1f",CAvg));
		sc.close();
	}

}
