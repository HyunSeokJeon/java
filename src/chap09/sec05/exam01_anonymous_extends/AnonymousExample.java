package chap09.sec05.exam01_anonymous_extends;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous a = new Anonymous();
		
		a.field.wake();
		System.out.println("----------------");
		a.method1();
		System.out.println("----------------");
		// 매개변수에 익명자식객체도 넣을 수 있다.
		a.method2(new Person() {
			void work() {
				System.out.println("여전히 출근합니다.");
			}
			@Override
			void wake() {
				System.out.println("또 7시에 일어납니다.");
				work();
			}
			
			
		});
	}
}
