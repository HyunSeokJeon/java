package chap04.sec02.exam01_if;

public class IfNestedExample {
	public static void main(String[] args) {
		// 0.0 <= Math.random() < 1.0 사이의 임의의 실수값을 반환한다.
		// 0.0 <= Math.random() * 20 < 20.0
		// 0 <= (int)(Math.random() * 20 < 20
		// 81 <= (int) (Math.random() * 20) + 81 < 101 사이의 임의의 정수, 81~100
		int score = (int) (Math.random() * 20) + 81;
		System.out.println("점수 : " + score);
		
		String grade;
		
		if( score >= 90 ) {
			if( score >= 95 ) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if( score >= 85 ) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("학점: " + grade);
	}
}
