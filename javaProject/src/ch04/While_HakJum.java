package ch04;

import java.util.Scanner;

public class While_HakJum {

	public static void main(String[] args) {
/* 전체 성적입력이 끝나면 마지막에 -1을 입력하세요. 
아무정수나 입력하세요 : 4
국어 : 88
영어 : 77
수학 : 88
계속하려면 아무정수나 입력하세요 : 1
국어 : 88
영어 : 99
수학 : 66
계속하려면 아무정수나 입력하세요 : -1
===========================
국어  영어  수학  총점  평균  등급
------------------------------------------
88    77     88     000   00.0   우
88    99     66     000   00.0   ?
===========================*/
		int num = 0;
		int kor;
		int mat;
		int eng;
		int tot;
		double avg;
		String grade = "";
		String result = "";
		Scanner scanner	= new Scanner(System.in);
		System.out.print("아무정수나 입력하세요 : ");
		 num =scanner.nextInt();
		while(true) {
				 
			System.out.print("국어 :");
			 kor =scanner.nextInt();
			System.out.print("영어 :");
			 eng =scanner.nextInt();
			System.out.print("수학 :");
			 mat =scanner.nextInt();
			
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
				
			System.out.print("계속 하려면 아무정수나 입력하세요 : ");
				 num =scanner.nextInt();
             if(num<1||num >55) {
					break;					
				}
		}
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("-------------------------------------------");
		System.out.println(result);
			
			scanner.close();
		}
				
	}

		
		
		
		
	


