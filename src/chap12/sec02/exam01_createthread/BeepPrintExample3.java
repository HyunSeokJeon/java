package chap12.sec02.exam01_createthread;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		Thread t1 = new BeepThread();
		
		t1.start();
		for(int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try{
				Thread.sleep(1000);
			} catch(Exception e) {
				
			}
		}
	}
}
