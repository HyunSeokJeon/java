package chap16.sec07.stream_looping;

import java.util.Arrays;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		
		System.out.println("[peek()를 마지막에 호출한 경우]");
		Arrays.stream(intArr)
			.filter(i -> i%2 == 0)
			.peek(n -> System.out.println(n));
		
		System.out.println("[최종처리 메소드를 마지막에 호출한 경우]");
		int total = Arrays
						.stream(intArr)
						.filter(i -> i%2 == 0)
						.peek(i -> System.out.println(i))
						.sum();
		System.out.println();
		System.out.println(total);
		System.out.println();
		Arrays.stream(intArr)
				.filter(i -> i%2 ==0)
				.forEach(i -> System.out.println(i));
	}
}
