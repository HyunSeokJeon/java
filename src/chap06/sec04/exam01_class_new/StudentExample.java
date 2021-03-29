package chap06.sec04.exam01_class_new;

// 실행가능한(main 메소드 포함) 클래스
public class StudentExample {
	public static void main(String[] args) {
		// Student() 생성자를 new 연산자로 호출하여 객체를 생성한 후 , 
		// 그 주소값을 Student 타입의 st 변수에 대입시킨다.
		Student st = new Student();
		System.out.println("st 변수가 Student 객체를 참조합니다.");
		
		Student st2 = new Student();
		System.out.println("st2 변수가 또 다른 Student 객체를 참조합니다.");
		
	}
}
