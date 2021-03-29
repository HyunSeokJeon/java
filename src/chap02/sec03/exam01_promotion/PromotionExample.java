package chap02.sec03.exam01_promotion;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		// 자동타입 변환 : int(4 bytes) <- byte(1byte)
		
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; 
		// 자동타입변환 : int(4byte)<-char(2byte)
		
		System.out.println("가의 유니코드 = " + intValue);
		
		intValue = 500;
		long longValue = intValue;
		// 자동타입변환 : long(8byte) <- int(4byte)
		
		System.out.println(longValue);
		
		double doubleValue = intValue;
		// 자동타입변환 : double(8byte) <- int(4byte)
		
		System.out.println(doubleValue);
	}
}
