package ch13;

import java.util.StringTokenizer;

public class StrToken {
	public static void main(String[] args) {
		String str="kim,20,180,55,서울,학생";
		String[] items=str.split(",");//콤마를기준으로 데이터를 분리
		for(String s : items) {
			System.out.println(s);
		}
		
		StringTokenizer st=new StringTokenizer(str, ",");//string 객체의 split()등의 메소드들 보다 더 다양한 메소드들을 제공한다.
		int cnt=st.countTokens();//토큰의 갯수
		System.out.println("토큰의 갯수 : " + cnt);
		while(st.hasMoreElements()) {//다음 토큰이 있을때까지 반복
			System.out.println(st.nextToken());//토큰하나를 가져와 리턴
		}
	}
}
