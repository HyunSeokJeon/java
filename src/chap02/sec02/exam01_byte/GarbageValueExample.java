package chap02.sec02.exam01_byte;

public class GarbageValueExample {
	public static void main(String[] args) {
		// -128 ~ 127
		byte var1 = 125;
		
		// -2^31 ~ 2^31-1
		int var2 = 125;
		
		// ¹Ýº¹¹®
		for(int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("\nvar1 =" + var1);
			System.out.println("var2 =" + var2);
		}
	}
}
