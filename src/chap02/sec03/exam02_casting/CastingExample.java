package chap02.sec03.exam02_casting;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		
//		char charValue = intValue;
		// char(2 bytes) <- int(4bytes)
		// Type mismatch: cannot convert from int to char
		char charValue = (char) intValue;
		System.out.println(charValue);
	}
}
