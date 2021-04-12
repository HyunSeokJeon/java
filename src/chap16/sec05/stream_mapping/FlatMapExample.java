package chap16.sec05.stream_mapping;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class FlatMapExample {
	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");
		
		inputList1.stream()
			.flatMap(s -> Arrays.stream(s.split(" ")))
			.forEach(s -> System.out.println(s));
		
		System.out.println();
		
		List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		
		
		inputList2.stream()
			.flatMapToInt(new Function<String, IntStream>() {

				@Override
				public IntStream apply(String data) {
					String[] strArr = data.split(",");
					int[] intArr = new int[strArr.length];
					for(int i=0; i<intArr.length; i++) {
						intArr[i] = Integer.parseInt(strArr[i].trim());
					}
					return Arrays.stream(intArr);
				}
				
			})
//		inputList2.stream()
//			.flatMapToInt(data -> {
//				String[] strArr = data.split(",");
//				int[] intArr = new int[strArr.length];
//				for(int i=0; i<intArr.length; i++) {
//					intArr[i] = Integer.parseInt(strArr[i].trim());
//				}
//				return Arrays.stream(intArr);
//			})
					
					
			.forEach(n -> System.out.println(n));
			
			
	}
}
