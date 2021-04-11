package chap16.sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class MapAndReduceExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 10),
			new Student("신용권", 20),
			new Student("유미선", 30)
		);
		
		double avg = 
				studentList.stream().mapToInt(new ToIntFunction<Student>() {

					@Override
					public int applyAsInt(Student s) {
						return s.getScore();
					}
				})
				//studentList.stream().mapToInt(Student::getScore)
				.average().getAsDouble();
		
		System.out.println("평균 점수" + avg);
	}
}
