package chap11.sec03.Exam04_clone;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member("sjunhs", "hyunseok", "******", 10, false);
		
		// ���� ��ü�� ���� �Ŀ� �н����� ����;
		Member clone = member.getMember();
		
		member.password = "111111";
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: " + clone.id);
		System.out.println("name: " + clone.name);
		System.out.println("password: " + clone.password);
		System.out.println("age: " + clone.age);
		System.out.println("adult: " + clone.adult);
		
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: " + member.id);
		System.out.println("name: " + member.name);
		System.out.println("password: " + member.password);
		System.out.println("age: " + member.age);
		System.out.println("adult: " + member.adult);
	}
}
