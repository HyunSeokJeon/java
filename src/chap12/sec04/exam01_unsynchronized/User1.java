package chap12.sec04.exam01_unsynchronized;

import chap12.sec04.exam02_synchronized.Calculator;

public class User1 extends Thread{
	private Calculator cal;
	
	public void setCalculator(Calculator cal) {
		this.setName("User1");
		this.cal = cal;
	}

	public void run() {
		cal.setMemory(100);
	}
	
}
