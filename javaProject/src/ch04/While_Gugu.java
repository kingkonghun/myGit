package ch04;

import java.util.Scanner;

public class While_Gugu {
 
	public static void main(String[] args) {
		
	
		int dan ;
		Scanner in = new Scanner(System.in);
		
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요: ");
		 dan =in.nextInt();
		System.out.println("** "+ dan + "단 **");
		int n=1;
		while(n<=9) {
					
		System.out.println(dan + "X" +n + "=" + dan*n);
			n++;}
				
		in.close();
			}
		}
  

