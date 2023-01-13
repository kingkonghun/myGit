package ch10;

public class OverloadEx {
	public void putDate(String a) {
		System.out.println(a);
	}
	public void putDate(int a) {
		System.out.println(a);
	}
	public void putDate(double a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		OverloadEx o = new OverloadEx();
		o.putDate("헤롤");
		o.putDate(10);
		o.putDate(null);
	}

}
