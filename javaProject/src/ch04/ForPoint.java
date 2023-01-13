package ch04;

import java.util.Scanner;

public class ForPoint {

	public static void main(String[] args) {
		int kor;
		int eng;
		int mat;
		int tot;
		double avg ;
		String grade ="";
		String result = "";//변수선언하고
		
		Scanner in = new Scanner(System.in);
		for(int i=1; i<=3; i++) {//3번 물어보고   
		
			System.out.print("국어 : ");
			 kor =in.nextInt();
			System.out.print("영어 : ");
			 eng = in.nextInt();
			System.out.print("수학 : ");
			 mat = in.nextInt();
				
		 tot=kor+eng+mat;
		 avg=tot/3;
		
				if (avg >= 90){
					grade = "수";
				}else if(avg >= 80) {
					grade = "우";
				}else if(avg >= 70) {
					grade = "미";
				}else if(avg >= 60) {
					grade = "양";
				}else {
					grade = "가";
				}
				
				
			result += kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+grade +"\n";
		}
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("-------------------------------------------");
		System.out.println(result);
		in.close();
	}

}
