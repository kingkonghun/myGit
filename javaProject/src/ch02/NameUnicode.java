package ch02;

public class NameUnicode {

	public static int temp() {
		int temp = '김';
		System.out.println("16비트 값 =" + Integer.toHexString(temp));

		int temp1 = '정';
		System.out.println("16비트 값 =" + Integer.toHexString(temp1));
		
		int temp2 = '훈';
		System.out.println("16비트 값 =" + Integer.toHexString(temp2));
		//ae40,c815,d6c8
		
		return temp2;
	}
		public static void main(String[] args) { 
		char aValue = '\uae40';
		System.out.println("char형('\\uae40\') : " + aValue);
		char bValue = '\uc815';
		System.out.println("char형('\\uc815\') : " + bValue);
		char cValue = '\ud6c8';
		System.out.println("char형('\\ud6c8\') : " + cValue);
	}

}
