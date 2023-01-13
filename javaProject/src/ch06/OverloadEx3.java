package ch06;

public class OverloadEx3 {

	public static void main(String[] args) {
		print("홍길동","djdj@mail.com","010-8888-8888");
		print("이순신",99,87,77);
		print("김과장",560,(560+0.3),560-(560*0.3));
	}
	   static void print(String name, int sal) {
		
		
	}
	   public static void print(String name, int saLary, double tax, double pay) {
			System.out.println("=======================================");
			System.out.println("이름\t\t급여\t세금\t실수령액");
			System.out.println(name +"\t"+ saLary +"\t"+ (int)tax +"\t"+ (int)pay);
			
			
		}
	
		static void print(String name, String email, String hp) {
			System.out.println("===============");
			System.out.println("이름\t이메일\t전화");
			System.out.println(name+"/t"+email+"\t"+hp);
		}
		static void print(String name, int kor, int eng, int mat) {
			System.out.println("================");
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
			System.out.println(name+"\t"+kor+"\t"+mat+"\t"+(kor+eng+mat)+"\t"+String.format("%.1f",(double)(kor+eng+mat)/3));
		}
	}

