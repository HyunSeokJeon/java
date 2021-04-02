package chap12.sec08.exam01_threadgroup;


public class WorkThread extends Thread{
	public WorkThread(ThreadGroup tg, String threadname) {
		super(tg, threadname);
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println(getName() + " interrupted");
				break;
			}
		}
		System.out.println(getName() + "Á¾·áµÊ");
	}
	
	

}
