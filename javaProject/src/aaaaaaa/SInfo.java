package aaaaaaa;

public class SInfo implements Student1 {

	public void address(String name, String add, String email) {
		System.out.println("==============================");
		System.out.println("이름\t주소\t이메일");
		System.out.println(NAME+"\t"+add+"\t"+email);

	}

	public void point(int kor, int eng, int math) {
		int tot = kor+eng+math;
		double avg=(double)(tot/3.0);
		System.out.println("-----------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(NAME+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.1f", avg));
		System.out.println("====================================");
	}
public void point() {
	
}
public void address() {
	
}
}
