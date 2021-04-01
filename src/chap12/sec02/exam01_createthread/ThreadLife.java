package chap12.sec02.exam01_createthread;

public class ThreadLife implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i < 21; i++) {
			System.out.println(Thread.currentThread().getName() + "number = " + i);
			
			
		}
	}
	
	public static void main(String[] args) {
		ThreadLife t1 = new ThreadLife();
		Thread first = new Thread(t1, "first1");
		
		Thread second = new Thread(t1, "second1");
		
		Thread thrid = new Thread(t1, "thrid1");
		
		first.start();
		second.start();
		thrid.start();
	}
	
	
}
