package ch19;

import java.net.InetAddress;

public class InetAddressExam2 {

	public static void main(String[] args) {
		try {
			InetAddress[] address = InetAddress.getAllByName("google.com");
			for(int i=0; i<address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
