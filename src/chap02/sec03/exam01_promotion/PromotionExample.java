package chap02.sec03.exam01_promotion;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		// �ڵ�Ÿ�� ��ȯ : int(4 bytes) <- byte(1byte)
		
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue; 
		// �ڵ�Ÿ�Ժ�ȯ : int(4byte)<-char(2byte)
		
		System.out.println("���� �����ڵ� = " + intValue);
		
		intValue = 500;
		long longValue = intValue;
		// �ڵ�Ÿ�Ժ�ȯ : long(8byte) <- int(4byte)
		
		System.out.println(longValue);
		
		double doubleValue = intValue;
		// �ڵ�Ÿ�Ժ�ȯ : double(8byte) <- int(4byte)
		
		System.out.println(doubleValue);
	}
}
