package chap12.verify.exam00_numlockprint;

public class MemberLockPrint implements Runnable{
	private int i = 1;
	
	public void run() {
		show();
	}
	
	public synchronized void show() {
		for(; i <= 500; i++) {
			if( (Thread.currentThread().getName()).equals("a") ){
				System.out.print("a");
			}else if( (Thread.currentThread().getName()).equals("b") ) {
				System.out.print("b");
			}else if( (Thread.currentThread().getName()).equals("c") ) {
				System.out.print("c");
			}
		}
	}
}