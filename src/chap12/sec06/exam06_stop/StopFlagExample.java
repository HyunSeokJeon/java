package chap12.sec06.exam06_stop;

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 pt = new PrintThread1();
		
		pt.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		pt.setStop(true);
	}
}
