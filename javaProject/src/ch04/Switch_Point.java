package ch04;

public class Switch_Point {

	public static void main(String[] args) {
		int kor = 85;
		int mat = 90;
		int eng = 70;
		int tot =kor + eng + mat;
		double avg = tot / 3.0;
		String grade = "";
		switch((int)(avg / 10)) { //double일 int 로 변환 스위치에서는 정수만 사용 가능
		case 10:
		case 9: grade = "수"; break;
		case 8: grade = "우"; break;
		case 7: grade = "미"; break;
		case 6: grade = "양"; break;
		default: grade = "가";
		}
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println(kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+grade);
	
		System.out.printf("%d\t%d\t%d\t%d\t%.1f\t%s",kor,eng,mat,tot,avg,grade);
	}
		
}
