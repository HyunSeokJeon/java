package chap11.sec05.Exam03_systemtime;

public class SystemExample {
	public static void main(String[] args) {
		
		// ���� �޼ҵ�� ��ü �������� Ŭ�����̸�.�޼ҵ�()�� ���� ȣ�� �� �� �ִ�.
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000������ ��: " + sum);
		System.out.printf("��꿡(%d)�����ʰ� �ҿ�Ǿ����ϴ�.", time2-time1);
	}
}
