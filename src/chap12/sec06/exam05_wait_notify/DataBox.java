package chap12.sec06.exam05_wait_notify;

public class DataBox {
	private String data;
	
	public synchronized String getData(){
		if(this.data == null) {
			try {
				wait();
			}catch(InterruptedException e) {
				
			}
		}
		String returnValue = data;
		System.out.println("Consumer�� ���� ������" + returnValue);
		data = null;
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch(InterruptedException e) {
				
			}
		}
		System.out.println("Producer�� �ִ� ������" + data);
		this.data = data;
		notify();
	}
}
