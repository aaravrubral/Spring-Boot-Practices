package aarav.dsa.com;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread th= new MyThread();
		th.start();

		for(int i=0;i<10;i++) {
			System.out.println("Main-Thread");
		}
	}

}
