package bbbbbbb;

public class MyThread_Ex extends Thread{
	String str = "";
	
	public MyThread_Ex(String str) {
		super(str);
	}
	
	
	@Override
	public void run() {
		for(int i =1; i<=5; i++) {
			System.out.println(getName()+"==>"+i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
