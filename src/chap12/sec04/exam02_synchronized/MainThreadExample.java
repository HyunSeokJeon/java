package chap12.sec04.exam02_synchronized;

import chap12.sec04.exam01_unsynchronized.User1;
import chap12.sec04.exam01_unsynchronized.User2;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(cal);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(cal);
		user2.start();
		
	}
}
