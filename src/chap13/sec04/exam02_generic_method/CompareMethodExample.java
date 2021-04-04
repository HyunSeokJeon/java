package chap13.sec04.exam02_generic_method;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		
		if (result1) {
			System.out.println("내부 값이 같은 객체");
		}else {
			System.out.println("내부 값이 다른 객체");
		}
		
		Pair<String, String> p3 = new Pair<String, String>("user1", "홍길동");
		Pair<String, String> p4 = new Pair<String, String>("user2", "홍길동");
		boolean result2 = Util.<String, String>compare(p3, p4);
		
		if (result2) {
			System.out.println("내부 값이 같은 객체");
		}else {
			System.out.println("내부 값이 다른 객체");
		}
	}
}
