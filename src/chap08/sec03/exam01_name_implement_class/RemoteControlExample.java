package chap08.sec03.exam01_name_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(-1);
		rc.turnOff();
				
	}
}
