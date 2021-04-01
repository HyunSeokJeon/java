package chap12.sec06.exam05_wait_notify;

public class WaitNotifyExample {
	public static void main(String[] args) {
		DataBox db = new DataBox();
		
		ProducerThread pt = new ProducerThread(db);
		ConsumerThread ct = new ConsumerThread(db);
		
		pt.start();
		ct.start();
	}
}
