package chap12.sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		
		
		//람다식
//		Thread t1 = new Thread( () -> {
//			Toolkit tk = Toolkit.getDefaultToolkit();
//			for(int i = 0; i< 5; i++) {
//				tk.beep();
//				try{
//					Thread.sleep(1000);
//				} catch(Exception e) {
//					
//				}
//			}
//		});
		//익명함수
//		Thread t1 = new Thread( new Runnable() {
//			Toolkit tk = Toolkit.getDefaultToolkit();
//			for(int i = 0; i< 5; i++) {
//				tk.beep();
//				try{
//					Thread.sleep(1000);
//				} catch(Exception e) {
//					
//				}
//			}
//		});
		
		Runnable beepTask = new BeepTask();
		Thread t1 = new Thread(beepTask);
		t1.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try{
				Thread.sleep(1000);
			} catch(Exception e) {
				
			}
		}
	}
}
