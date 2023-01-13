package ch14;

import java.util.LinkedList;

public class LinkedExam {
	public static void main(String[] args) {
		//큐 구조 : FIFO(First In First Out)
		//입력 offer, 출력 poll
		String[] fruits= {"사과","배","포도","딸기","수박"};
		LinkedList<String> list=new LinkedList<>();
		for(String str : fruits) {
			list.offer(str);//큐 구조에 자료 입력 선입선출 메소드 offer
		}
		String str="";
		while((str=(String)list.poll()) != null ) {//poll() 자료 꺼내기 poll은 자료형이 미정(E)이기 떄문에 (STring)처럼 자료형을 적어주어야한다.
			//poll()한값을 str에 대입하는데, str은 boolean이 아니기 때문에 전체로 묶어 줘야한다.
		    System.out.println(str+"삭제되었습니다.");
		}
	}
}
