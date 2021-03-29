package chap04.sec03.exam01_for;

public class ForSumFrom1To100 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("1~100 гу : " + sum);
	}
}
