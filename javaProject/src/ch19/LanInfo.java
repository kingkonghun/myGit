package ch19;

import java.net.NetworkInterface;
import java.util.Enumeration;

public class LanInfo {

	public static void main(String[] args) {
		try {
			//networkinterface : 랜카드의 정보제공용 객체
			Enumeration<NetworkInterface>enu=NetworkInterface.getNetworkInterfaces();
			//getnetworkinterfaces(): 네트워크 인터페이스(팬카드)의 다양한 정보 제공
			while (enu.hasMoreElements()) {//다음 요소가 있으면 true
				NetworkInterface net=enu.nextElement();//다음요소진행
				System.out.println(net);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
