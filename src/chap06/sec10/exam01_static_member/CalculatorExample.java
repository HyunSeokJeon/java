package chap06.sec10.exam01_static_member;

public class CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		
		int result2 = Calculator.plus(10, 5);
		
		Calculator mycal = new Calculator();
		int result3 = mycal.minus(10, 6);
	}
}
