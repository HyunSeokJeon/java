package chap06.sec08.exam01_method_declaration;

public class CalculatorExample {
	public static void main(String[] args) {
		// Calculator 클래스형
		Calculator cal = new Calculator();
		
		cal.powerOn();
		
		int result = cal.plus(5, 6);
		System.out.println(result);
		
		byte x = 10;
		byte y = 4;
		
		double result2 = cal.divide(x, y);
		System.out.println(result2);
		
		
		
		cal.powerOff();
		
		
		
		
		
		
	}
}
