package ch05;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] number = {10,20,30};
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
System.out.println();
//for~each문
		for(int value : number) {//객체를 다룰때 유용한 기법
			System.out.println(value);
		}




	}

}
