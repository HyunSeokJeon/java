package chap06.sec14.exam01_getter_setter;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		int wrongInt = myCar.getSpeed();
		System.out.println(wrongInt);
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재속도 : " + myCar.getSpeed());
	}
}
