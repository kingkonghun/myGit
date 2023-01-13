package aaaaaaa;

public class StrBuildEx {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("\"I am a ");
		StringBuilder str2 = new StringBuilder("Java Programmer \"");
		str1.append(str2);
		System.out.println("append()메소드를 활용 : "+str1);
		str1.replace(7, 12, "Jsp");
		System.out.println("replace()을 활용 : "+str1);
		String str3=str1.substring(7);
		System.out.println("substring()을 활용 : "+"\""+str3);
		System.out.println("-------------------------------");
	}

}
