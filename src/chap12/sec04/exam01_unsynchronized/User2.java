package chap12.sec04.exam01_unsynchronized;

import chap12.sec04.exam02_synchronized.Calculator;

public class User2 extends Thread{
	private Calculator cal;
	
	public void setCalculator(Calculator cal) {
		this.setName("User2");
		this.cal = cal;
	}

	public void run() {
		cal.setMemory(50);
	}
	
	
}
