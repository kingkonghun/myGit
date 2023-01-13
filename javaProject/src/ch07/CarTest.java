package ch07;

public class CarTest {
public static void main(String[] args) {
	Car myCar = new Car();//객체 생성 앞에서 데려오기 위해
	myCar.changeGear(1);
	myCar.speedUp();
	System.out.println(myCar);
}
}
