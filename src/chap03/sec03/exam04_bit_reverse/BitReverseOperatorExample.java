package chap03.sec03.exam04_bit_reverse;

public class BitReverseOperatorExample {
	public static void main(String[] args) {
		int v1 = 10; // 00000000 00000000 00000000 00001010
		int v2 = ~v1;
		
		System.out.println(v2);
		int x = 1000000;
		int y = 1000000;
		int z= x * y;
		System.out.println(z);
		
		
	}
}
