package ch07;

public class RadioTest {
	public static void main(String[] args) {
        Radio br = new Radio();
        br.name="브리츠";
        br.channel=89.1;
        br.volume=12;
        br.print();

        Radio ir = new Radio();
        ir.name="아이리버";
        ir.channel=95.1;
        ir.volume=9;
        ir.print();
    }
}
