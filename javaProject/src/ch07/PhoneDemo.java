package ch07;
//한개의 파일에 2개이상의 class를 작성할때는 main 메소드가 있는 public class를 클래스이름으로 저장
//다른 파일은 접근제어지정자가 default(앞에 안쓰는)로 처리되어야한다.
class Phone{
	String model;
	int value;
	void print() {
		System.out.println(value+"만원 짜리"+model+"스마트폰");
	}
}



public class PhoneDemo {//실행파일
 public static void main(String[] args) {
	Phone myPhone = new Phone()	;//객체생성
	myPhone.model = "갤럭시 s11";
	myPhone.value=100;
	myPhone.print();
	
	Phone yourPhone = new Phone()	;//객체생성
	yourPhone.model = "갤럭시 s77";//class에서 값이 바뀌는것이 아니야 독립적인 메모리 위치
	yourPhone.value=150;
	yourPhone.print();
}
}
