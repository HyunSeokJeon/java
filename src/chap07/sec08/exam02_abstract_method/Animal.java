package chap07.sec08.exam02_abstract_method;

public abstract class Animal {
	
	// 1. 필드
	public String kind;
	
	// 2. 생성자
	
	// 3. 추상 메소드
	public abstract void sound();
	// 4. 일반 메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
}
