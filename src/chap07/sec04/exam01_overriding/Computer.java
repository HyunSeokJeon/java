package chap07.sec04.exam01_overriding;

public class Computer extends Calculator {
	
	// 어노테이션 : 컴파일러에게 코드(재정의여부)의 검증을 요청한다.
	@Override
	//메소드 재정의(overriding)
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
	
}
