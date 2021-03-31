package chap11.sec13.exam01_math;

public class MathExample {
	public static void main(String[] args) {
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4);
		
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5 = " + v5);
		System.out.println("v6 = " + v6);
		
		double v7 = Math.random();
		// 0.0 <= Math.random < 1.0
		System.out.println("v7 = " + v7);
		
		double v8 = Math.rint(5.3);
		double v9 = Math.rint(5.3);
		System.out.println("v8 = " + v8);
		System.out.println("v9 = " + v9);
		
		
		long v10 = Math.round(5.3);
		long v11 = Math.round(5.3);
		System.out.println("v10 = " + v10);
		System.out.println("v11 = " + v11);
		
		
		
		
	}
}
