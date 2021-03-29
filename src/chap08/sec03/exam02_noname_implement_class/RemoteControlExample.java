package chap08.sec03.exam02_noname_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new RemoteControl() {
			@Override
			public void turnOn() {
				
			}
			@Override
			public void turnOff() {
				
			}
			@Override
			public void setVolume(int volume) {
				
			}
		};
		rc.turnOff();
		
		
	}
}
