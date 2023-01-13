package ch05;

public class ArrayBasic {

	public static void main(String[] args) {
		int[] score; // 배열참조변수 선언
		score=new int[5];//new를 통해 메모리에 5개의 int 형 자리를 준비
		//int[] score = new int[5];
		//배열생성(4byte x 5=20byte)
		System.out.println(score);//메모리의 주소값이 을 가리키는 참조변수가 출력
		score[0]=100;//인트형 100이 들어가야 초기화가능
		score[1]=90;
		score[2]=80;
		score[3]=70;
		score[4]=60;
		
		//int[] score={100,90,80,70,60}; 위와 같다. 범위초과에 주의
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);

		for(int i=0; i<5; i++) {//배열을 다루는데 있어서 for문은 거의 필수적으로 사용된다.
			System.out.println(score[i]);
}
				
	}

}
