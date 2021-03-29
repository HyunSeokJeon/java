package chap07.sec08.exam01_abstract_class;

public abstract class Phone {
	// 추상 클래스의 구성 멤버
	// 1.필드
	public String owner;
	// 2. 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 3. 추상메소드
	public abstract void turnOff();
	
	// 4. 일반메소드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
}
