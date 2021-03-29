package chap11.sec03.Exam06_finalize;

public class FinalizeExample {
	public static void main(String[] args) {
		Counter counter = null;
		
		for(int i = 1; i <= 50; i++) {
			counter = new Counter(i);
			counter = null;
			System.out.println(i);
			System.gc(); // Garbage Collector를 강제로 실행시킨다.
		}
	}
}
