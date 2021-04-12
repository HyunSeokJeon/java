package chap16.sec06.stream_sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
	public static void main(String[] args) {
		// 숫자요소일 경우
		IntStream intStream = Arrays.stream(new int[] {5,3,1,4,2});
		
		intStream.sorted()
				.forEach(i -> System.out.println(i));
		
		System.out.println();
		
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 30),
				new Student("신용권", 10),
				new Student("유미선", 20)
				);
		
		studentList.stream()
				.sorted()
				.mapToInt(Student::getScore)
				.forEach(i -> System.out.println(i));
		
		studentList.stream()
				.sorted(Comparator.reverseOrder())
				.mapToInt(Student::getScore)
				.forEach(i -> System.out.println(i));
	}
}
