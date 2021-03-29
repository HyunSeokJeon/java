package chap08.sec04.exam03_static_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		// 지역변수 : 메소드 안에 정의된 변수
		RemoteControl.changeBattery();
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};
		System.out.println(rc.getClass());
		
		rc.setMute(true);
	}
}
