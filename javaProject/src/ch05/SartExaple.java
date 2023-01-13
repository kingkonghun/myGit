package ch05;

import java.util.Arrays;
import java.util.Collections;

public class SartExaple {

	public static void main(String[] args) {
		int num[]=	{29,1,81,70,13,92,36};
		Arrays.sort(num);//오름차순 정렬 함수 sort
		for(int i:num) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-------------------------");
		//내림차순 정렬 integer라는 Wrapper class타입으로 데이터 처리가 되어야하고
		Integer rev[]=	{29,1,81,70,13,92,36};//int와 비슷
		Arrays.sort(rev, Collections.reverseOrder());//내림차순 객체 콜랙션 리벌스 매소드를 써서 처리
		for(int i:rev) {
			System.out.println(i + " ");
		}
	}

}
