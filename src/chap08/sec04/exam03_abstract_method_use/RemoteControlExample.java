package chap08.sec04.exam03_abstract_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		System.out.println(rc.getClass());		
	}
}
