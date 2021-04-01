package chap12.sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for(int i = 0; i< 5; i++) {
			tk.beep();
			try{
				Thread.sleep(1000);
			} catch(Exception e) {
				
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try{
				Thread.sleep(1000);
			} catch(Exception e) {
				
			}
		}
	}
}
