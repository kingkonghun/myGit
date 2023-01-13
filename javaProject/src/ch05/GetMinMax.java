package ch05;

public class GetMinMax {

	public static void main(String[] args) {
		/*데이터 : 79, 88, 91, 33, 100, 55, 95
위 데이터를 활용해서 최대값과 최소값을 출력해보세요.
출력결과:
최대값 : 100
최소값 : 33
	*/
			
		int s[]= {79, 88, 91, 33, 100, 55, 95};
		
		int max=0;
		for(int i=0; i<s.length; i++) {
			if(s[i]>max) 
				max=s[i];		
				}
		
		int minimuin;
		minimuin = s[0];
		for(int i=1; i<s.length; i++) {
			if(s[i]<minimuin) 
				minimuin=s[i];			
		}
		System.out.println("최대값 : "+ max );
		System.out.println("최소값 : "+ minimuin);
	}
}