package chap08.sec02.exam03_abstract_method;

public interface RemoteControl {
	// 인터페이스의 구성멤버
	
	// 1. 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 2. 추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 3. 디폴트메소드
	
	
	// 4. 정적메소드
}
