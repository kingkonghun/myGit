package aaaaaaa;

public class MemberOuter {

	class MemberInner{
		int num=1;
		String name ="홍길동";
		String email = "hong@gmail.com";
		public void print() {
			System.out.println("-----------------------");
			System.out.println("고객번호 : "+num);
			System.out.println("이름 : "+name);
			System.out.println("이메일 : "+email);
			System.out.println("-----------------------");
		}
	}
	
		
	public static void main(String[] args) {
		MemberOuter o = new MemberOuter()	;
		MemberOuter.MemberInner i = o.new MemberInner()	;
		i.print();

	}

}
