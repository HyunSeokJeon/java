package chap12.sec02.exam01_createthread;

public class ThreadEnd extends Thread{

	@Override
	public void run() {
		for(int i = 1; i < 21; i++) {
			System.out.println("run number = " + i);
		}
	}
	
	public static void main(String[] args) {
		ThreadEnd te = new ThreadEnd();
		
		te.start();
		
		for (int i = 101; i < 121; i++) {
			System.out.println("main number = " + i);
		}
	}
}
