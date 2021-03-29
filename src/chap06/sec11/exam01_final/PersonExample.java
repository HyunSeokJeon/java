package chap06.sec11.exam01_final;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456 -1122922", "½Ã¿ø");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa"; // The final field Person.ssn cannot be assigned
//		p1.ssn = "1";
		p1.name = "??";
	}
}
