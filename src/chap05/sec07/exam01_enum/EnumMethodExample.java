package chap05.sec07.exam01_enum;

public class EnumMethodExample {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		
		// 열거형 상수의 문자값을 반환
		String name = today.name();
		System.out.println(name);
		
		// 연거형 상수의 순서를 숫자로 반환
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
	}
}
