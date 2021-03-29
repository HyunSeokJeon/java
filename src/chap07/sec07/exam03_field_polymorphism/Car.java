package chap07.sec07.exam03_field_polymorphism;

public class Car {
	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	// 생성자
	// 메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		int i = 0;
		if(frontLeftTire.roll() == false) {
			stop();
			i= 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			i= 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			i= 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			i= 4;
		}
		return i;
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
