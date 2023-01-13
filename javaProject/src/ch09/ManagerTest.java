package ch09;

import aaaaaaa.Manager;

public class ManagerTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.input(1, "홍길동", "서울 강남구 역삼동", "hong@gmail.com", 3000, "123456-1234567");
		m.print();
	}

}
