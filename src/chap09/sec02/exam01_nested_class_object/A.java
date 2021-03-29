package chap09.sec02.exam01_nested_class_object;

// 바깥 클래스
public class A {
	A(){
		System.out.println("A 객체가 생성됨");
	}
	
	int x;
	
	// 인스턴스 멤버 클래스
	public class B{
		B(){
			System.out.println("B 객체가 생성됨");
		}
		int b = x + 1;
		int field1;
		void method1() {
			
		}
		
		// 인스턴스 멤버 클래스 안에서 정적 필드 사용 불가
		// 정적 필드
		// static int field2;//The field field2 cannot be declared static in a non-static inner type, unless initialized with a constant expression
		// 정적 메소드 
		//		static void method2() {//The method method2 cannot be declared static; static methods can only be declared in a static or top level type
		// }
	}
	
	// 정적 멤버 클래스
	static class C {
		C(){
			System.out.println("C 객체가 생성됨");
		}
		int field1;
		static int field2;
		void method1() {
			
		}
		static void method2() {
			
		}
	}
	
	void method() {
		// 로컬 클래스
		class D{
			D() {
				System.out.println("D 객체가 생성됨");
			}
			int field1;
			void method1() {
				
			}
			// 마찬가지로 정적 필드, 정적 메소드 사용불가
		}	
		D d = new D();
		d.field1 = 3;
		d.method1();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
