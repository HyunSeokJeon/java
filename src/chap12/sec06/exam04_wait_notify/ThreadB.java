package chap12.sec06.exam04_wait_notify;

public class ThreadB extends Thread{
private WorkObject wo;
	
	public ThreadB(WorkObject wo) {
		this.wo = wo;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			wo.methodB();
		}
	}
}
