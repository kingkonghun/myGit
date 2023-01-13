package bbbbbbb;

public class MyThread_Im implements Runnable{
	String str;
	public MyThread_Im(String str) {
		this.str=str;
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(str+"==>"+i);
		}
		
	}

}
