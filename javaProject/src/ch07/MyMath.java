package ch07;

public class MyMath {
	//멤버메소드 오버로딩기법
	int square(int i) {
		return i+i;
	}
	double square(double i) {//오버로딩 int double 은 연관없어 안에값()만 연관있어
		return i+i;
	}
}
