package chap09.sec02.exam01_nested_class_object;

// �ٱ� Ŭ����
public class A {
	A(){
		System.out.println("A ��ü�� ������");
	}
	
	int x;
	
	// �ν��Ͻ� ��� Ŭ����
	public class B{
		B(){
			System.out.println("B ��ü�� ������");
		}
		int b = x + 1;
		int field1;
		void method1() {
			
		}
		
		// �ν��Ͻ� ��� Ŭ���� �ȿ��� ���� �ʵ� ��� �Ұ�
		// ���� �ʵ�
		// static int field2;//The field field2 cannot be declared static in a non-static inner type, unless initialized with a constant expression
		// ���� �޼ҵ� 
		//		static void method2() {//The method method2 cannot be declared static; static methods can only be declared in a static or top level type
		// }
	}
	
	// ���� ��� Ŭ����
	static class C {
		C(){
			System.out.println("C ��ü�� ������");
		}
		int field1;
		static int field2;
		void method1() {
			
		}
		static void method2() {
			
		}
	}
	
	void method() {
		// ���� Ŭ����
		class D{
			D() {
				System.out.println("D ��ü�� ������");
			}
			int field1;
			void method1() {
				
			}
			// ���������� ���� �ʵ�, ���� �޼ҵ� ���Ұ�
		}	
		D d = new D();
		d.field1 = 3;
		d.method1();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
