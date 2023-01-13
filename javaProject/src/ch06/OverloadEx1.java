package ch06;

public class OverloadEx1 {
	public static void main(String[] args) {
		print(10.5);
		print("hello");
		print(100);
		print("hi","Java");
	}//메소드 오버로딩 
	//이름이 같고
	//매개변수의 갯수가 다르거나 하면 데이터 타입이 달라야
	 static void print(double a) {
			System.out.println(a);
			
		}
	 static void print(String b) {
			System.out.println(b);
			
		}
	 static void print(int c) {
			System.out.println(c);
			
		}
	 static void print(String a, String b) {
		System.out.println(a);
		System.out.println(b);
		
	}

	 

	
}
