package bbbbbbb;

import java.util.Scanner;

public class EEE {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int i=1;//
		int sum =0;
		if(num>0) {
			
			while(i<=num) {
				sum += i;
				i++;
			}
			System.out.println("1부터"+num+"입니다."+sum);
		}else {
			System.out.println("숫자가 1이상이 아니다.");
		}

	}
}
