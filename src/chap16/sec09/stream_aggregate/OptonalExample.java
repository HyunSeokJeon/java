package chap16.sec09.stream_aggregate;

import java.util.Arrays;
import java.util.OptionalDouble;

public class OptonalExample {
	public static void main(String[] args) {
		int[] intArr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		OptionalDouble avg = Arrays.stream(intArr)
							.filter(i -> i%11 == 0)
							.average();
		if (avg.isPresent()) {
			System.out.println("ЦђБе : " + avg);
		}else {
			System.out.println("ЦђБе : " + 0.0);
		}
		
		double avg2 = Arrays.stream(intArr)
							.filter(i -> i%11 == 0)
							.average()
							.orElse(0.0);
		System.out.println(avg2);
		
		Arrays.stream(intArr)
			.filter(i -> i%11 ==0)
			.average()
			.ifPresent(i -> System.out.println(i));
	}
}
