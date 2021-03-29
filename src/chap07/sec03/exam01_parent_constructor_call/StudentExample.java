package chap07.sec03.exam01_parent_constructor_call;

public class StudentExample {
	public static void main(String[] args) {
		Student st = new Student("박자바", "190029-131314", 11);
		
		System.out.println("이름: " + st.name);
		System.out.println("주번: " + st.ssn);
		System.out.println("번호: " + st.studentNo);
	}
}
