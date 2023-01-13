package ch02;

public class VarlimitTest {

	public static void main(String[] args) {
	    int index = 2;//지역변수 선언만 하면 오류
	    //지역변수는 반드시 초기화를 해야한다.
	 	    
	    index = index + 1;//?+1 값이 초기화 =2
	    System.out.println("index :" + index);

	}

}
