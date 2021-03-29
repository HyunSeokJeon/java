package chap11.sec03.Exam04_clone;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member("sjunhs", "hyunseok", "******", 10, false);
		
		// 복제 객체를 얻은 후에 패스워드 변경;
		Member clone = member.getMember();
		
		member.password = "111111";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: " + clone.id);
		System.out.println("name: " + clone.name);
		System.out.println("password: " + clone.password);
		System.out.println("age: " + clone.age);
		System.out.println("adult: " + clone.adult);
		
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id: " + member.id);
		System.out.println("name: " + member.name);
		System.out.println("password: " + member.password);
		System.out.println("age: " + member.age);
		System.out.println("adult: " + member.adult);
	}
}
