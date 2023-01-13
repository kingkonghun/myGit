package ch03;

public class InCrease {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		j = i++;//i의 값을 1증가시킴 후위연산자 나중에 계산
		System.out.println(i + "," + j);// 이상태에서는 아직 적용안된 6,5
		
		i = 5;
		j = ++i; //i의 값을 1증가시킴 선반영 먼저 계산
		System.out.println(i + "," + j);
	}

}
