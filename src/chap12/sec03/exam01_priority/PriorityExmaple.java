package chap12.sec03.exam01_priority;

public class PriorityExmaple {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			Thread t1= new CalcThread("thread" + i);
			if(i != 10) {
				t1.setPriority(Thread.MIN_PRIORITY);
			}else {
				t1.setPriority(Thread.MAX_PRIORITY);
			}
			t1.start();
		}
	}
}
