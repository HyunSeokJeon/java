package chap12.sec06.exam05_wait_notify;

public class ProducerThread extends Thread{
	private DataBox db;
	
	public ProducerThread(DataBox db) {
		this.db = db;
	}

	@Override
	public void run() {
		for(int i = 0; i < 20; i++) {
			String a = Integer.toString(i);
			db.setData(a);
		}
	}
	
	
}
