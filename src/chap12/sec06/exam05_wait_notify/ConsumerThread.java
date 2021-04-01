package chap12.sec06.exam05_wait_notify;

public class ConsumerThread extends Thread{
private DataBox db;
	
	public ConsumerThread(DataBox db) {
		this.db = db;
	}

	@Override
	public void run() {
		for(int i = 0; i < 20; i++) {
			db.getData();
		}
	}
	
}
