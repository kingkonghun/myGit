package ch04;

public class BreakEx4 {

	public static void main(String[] args) {
		/*while, break문을 사용해서 n값이 8일때 while문을 빠져나오는 프로그램을 작성해 보세요.
출력 결과 :
------------------------------------
1 Hello World
2 Hello World
3 Hello World
4 Hello World
5 Hello World
6 Hello World
7 Hello World
n값이 8이며 while문 빠져나옴*/  
		int n = 1;
		while(n<10) {
			System.out.println(n +" Hello World");
		n++;
			if(n>=8)
			break;
		}
		
		
		
		
	}

}
