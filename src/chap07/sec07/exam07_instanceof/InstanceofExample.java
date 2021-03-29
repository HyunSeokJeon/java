package chap07.sec07.exam07_instanceof;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("Child로 변환 성공");
		}else {
			System.out.println("Child로 변환하지 않음");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("Child로 변환 성공");
	}
	public static void main(String[] args) {
		// 자동 형변환
		Parent a = new Child();
		method1(a);
		method2(a);
		
		Parent b = new Parent();
		method1(b);
	}
}
