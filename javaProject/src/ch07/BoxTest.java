package ch07;
//실행파일
public class BoxTest {
 public static void main(String[] args) {
	 	Box b;//객체형 데이터 타입 참조변수;
	 	b= new Box();//객체 생성
	 	b.width =20;
	 	b.length = 20;
	 	b.height =30;
	 	System.out.println("상자의 가로, 세로, 높이는 "+b.length+","+b.width+","+b.height+"입니다.");
}
}
