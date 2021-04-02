package chap12.sec08.exam01_threadgroup;

public class ThreadGroupExample {
	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread wtA = new WorkThread(myGroup, "workThreadA");
		WorkThread wtB = new WorkThread(myGroup, "workThreadB");
		
		wtA.start();
		wtB.start();
		
		System.out.println("[ main ������ �׷��� list() �޼ҵ� ��� ���� ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();
		
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {}
		
		System.out.println("[ myGroup ������ �׷��� interrupt() �޼ҵ� ȣ��");
		myGroup.interrupt();

	}
}
