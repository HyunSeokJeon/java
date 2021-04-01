package chap12.sec06.exam06_stop;

public class interruptExample2 {
	public static void main(String[] args) {
		PrintThread2 pt = new PrintThread2();
		
		pt.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		pt.interrupt();
	}
}
