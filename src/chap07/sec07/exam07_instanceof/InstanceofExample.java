package chap07.sec07.exam07_instanceof;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("Child�� ��ȯ ����");
		}else {
			System.out.println("Child�� ��ȯ���� ����");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("Child�� ��ȯ ����");
	}
	public static void main(String[] args) {
		// �ڵ� ����ȯ
		Parent a = new Child();
		method1(a);
		method2(a);
		
		Parent b = new Parent();
		method1(b);
	}
}
