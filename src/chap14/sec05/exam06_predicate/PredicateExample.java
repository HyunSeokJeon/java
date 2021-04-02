package chap14.sec05.exam06_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", "����", 90),
			new Student("�����", "����", 90),
			new Student("���ڹ�", "����", 95),
			new Student("���ѳ�", "����", 92)
			);
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for(Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		double result = (double) sum / count;
		return result;
	}
	
	public static void main(String[] args) {
		double manAvg = avg(t -> t.getSex().equals("����"));
		System.out.println("��������" + manAvg);
		
		double girlAvg = avg(t -> t.getSex().equals("����"));
		System.out.println("��������" + girlAvg);
	}
}
