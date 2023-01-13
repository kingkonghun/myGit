package ch06;

import java.math.BigInteger;

public class BingIntEx {

	static BigInteger factorial(int n) {
		BigInteger fac=BigInteger.ONE;//
		for(int i=1; i<=n; i++) {
			fac = fac.multiply(BigInteger.valueOf(i));//객체로 바꿔주는 작업
		}
		return fac;
	}
}
