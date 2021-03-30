package chap11.sec05.Exam03_systemtime;

public class SystemExample {
	public static void main(String[] args) {
		
		// 정적 메소드는 객체 생성없이 클래스이름.메소드()를 직접 호출 할 수 있다.
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000까지의 합: " + sum);
		System.out.printf("계산에(%d)나노초가 소요되었습니다.", time2-time1);
	}
}
