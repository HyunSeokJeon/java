package chap12.sec02.exam02_threadname;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: " + mainThread.getName());
		
		Thread t1 = new ThreadA();
		
		Thread t2 = new ThreadB();
		System.out.println("�۾� ������ �̸�: " + t1.getName());
		t1.start();
		System.out.println("�۾� ������ �̸�: " + t2.getName());
		t2.start();
		
	}
}
