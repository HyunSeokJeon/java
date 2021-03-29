package chap09.sec05.exam01_anonymous_extends;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous a = new Anonymous();
		
		a.field.wake();
		System.out.println("----------------");
		a.method1();
		System.out.println("----------------");
		// �Ű������� �͸��ڽİ�ü�� ���� �� �ִ�.
		a.method2(new Person() {
			void work() {
				System.out.println("������ ����մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("�� 7�ÿ� �Ͼ�ϴ�.");
				work();
			}
			
			
		});
	}
}
