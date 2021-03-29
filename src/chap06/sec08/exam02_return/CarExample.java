package chap06.sec08.exam02_return;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		System.out.println(Integer.MAX_VALUE);
		
		
		
	}
}
