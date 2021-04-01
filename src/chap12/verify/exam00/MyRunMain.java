package chap12.verify.exam00;

public class MyRunMain {
	public static void main(String[] args) {
		Thread t1 = new MyThread();
		
		Runnable r = new MyRun();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		for(int i = 0; i< 500; i++) {
			System.out.print("M");
		}
	}
}
