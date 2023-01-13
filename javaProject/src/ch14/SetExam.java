package ch14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

	public static void main(String[] args) {
		Set<String> hs=new HashSet<>();
		//Set은 중복값을 허용하지 않음 계속 sorting을 하기 때문에 대량의 데이터를 다루기엔 비효율적
		hs.add("korea");
		hs.add("japan");
		hs.add("america");
		hs.add("britain");
		hs.add("korea");//중복값은 처리되지 않는다.
		System.out.println(hs);
		for(String str : hs) {
			System.out.println(str);
		}
		//iterator반복 처리를 위한 클래스
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {//다음 요소가 있으면 true
			System.out.println(it.next());//다음 요소를 꺼냄
		}
	}
}
