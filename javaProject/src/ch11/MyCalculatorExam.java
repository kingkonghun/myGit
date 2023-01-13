package ch11;

public class MyCalculatorExam {

	public static void main(String[] args) {
		//다형성
		Calculator cal = new Mycalculator();
		int value1 = cal.multiple(5, 10);
		int value2 = cal.plus(5, 10);
		int value3 = cal.exec(5, 10);

	}

}
