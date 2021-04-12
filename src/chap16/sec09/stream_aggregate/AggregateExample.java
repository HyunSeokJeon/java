package chap16.sec09.stream_aggregate;

import java.util.Arrays;

public class AggregateExample {
	public static void main(String[] args) {
		int[] intArr = new int[] {1, 2, 3, 4, 5};
		
		long count = Arrays.stream(intArr)
				.filter(i -> i%2==0)
				.count();
		System.out.println("2의 배수의 개수: " + count);
		
		long sum = Arrays.stream(intArr)
				.filter(i -> i%2 == 0)
				.sum();
		System.out.println("2의 배수들의 합: " + sum);
		
		double avg = Arrays.stream(intArr)
				.average()
				.getAsDouble();
		System.out.println(avg);
		
		int max = Arrays.stream(intArr)
				.max()
				.getAsInt();
		System.out.println(max);
		
		int min = Arrays.stream(intArr)
				.min()
				.getAsInt();
		System.out.println(min);
		
		int first = Arrays.stream(intArr)
				.findFirst()
				.getAsInt();
		System.out.println(first);
		
		
	}
}
