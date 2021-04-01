package chap12.sec06.exam04_wait_notify;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject wo = new WorkObject();
		ThreadA ta = new ThreadA(wo);
		ThreadB tb = new ThreadB(wo);
		
		ta.start();
		tb.start();
	}
}
