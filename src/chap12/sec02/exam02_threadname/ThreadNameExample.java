package chap12.sec02.exam02_threadname;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		Thread t1 = new ThreadA();
		
		Thread t2 = new ThreadB();
		System.out.println("작업 스레드 이름: " + t1.getName());
		t1.start();
		System.out.println("작업 스레드 이름: " + t2.getName());
		t2.start();
		
	}
}
