package chap07.sec03.exam01_parent_constructor_call;

public class StudentExample {
	public static void main(String[] args) {
		Student st = new Student("���ڹ�", "190029-131314", 11);
		
		System.out.println("�̸�: " + st.name);
		System.out.println("�ֹ�: " + st.ssn);
		System.out.println("��ȣ: " + st.studentNo);
	}
}
