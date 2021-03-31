package chap11.sec13.exam01_math;

public class MathRandomExample {
	public static void main(String[] args) {
		// 0.0 <= Math.random < 1.0	
		
		int num = (int) Math.ceil(Math.random()*6);
		System.out.println("ÁÖ»çÀ§ ´«: " + num);
	}	
}
