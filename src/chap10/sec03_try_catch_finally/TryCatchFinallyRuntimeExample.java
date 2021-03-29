package chap10.sec03_try_catch_finally;

public class TryCatchFinallyRuntimeExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			// ���ܹ߻� ������ �ڵ�
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			// ����ó�� �ڵ� ����
			System.out.println("���డ���� �Ű����� ���� �����մϴ�. " + e);
		} finally {
			// ������ �����ϴ� �ڵ�
			System.out.println("�ٽ� �����ϼ���.");
		}
	}
}
