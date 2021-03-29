package chap03.sec04.exam01_arithmetic;

public class InifinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		/*
		int y = 0;
		double z= x / y;
		
		 * System.out.println(z); 
		 * java.lang.ArithmeticException: / by zero
		 */
		
		double y = 0.0;
		double z = x / y;
		double t = x % y;
		
		if (Double.isInfinite(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z);
		}
		
		if (Double.isNaN(t)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(t);
		}
	}
}
