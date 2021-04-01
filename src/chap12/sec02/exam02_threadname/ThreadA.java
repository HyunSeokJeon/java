package chap12.sec02.exam02_threadname;

public class ThreadA extends Thread{
	ThreadA(){
		setName("ThreadA");
	}

	@Override
	public void run() {
		System.out.println(getName() + "호출");
		System.out.println(getName() + "호출");
	}
	
}
