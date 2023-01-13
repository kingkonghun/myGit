package bbbbbbb;

public class MyThread_Im_Use {

	public static void main(String[] args) {
		
		MyThread_Im i = new MyThread_Im("스레드1");
		MyThread_Im j = new MyThread_Im("스레드2");
		
		Thread i1 =new Thread(i);
		Thread j1 =new Thread(j);
		i1.setPriority(Thread.MIN_PRIORITY);
		j1.setPriority(Thread.MAX_PRIORITY);
		j1.start();
		i1.start();
	}

}
