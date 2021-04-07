package chap14.verity.exam06;

import java.util.function.Function;

public class LambdaExample {
	private static Student[] students = { 
			new Student("ȫ�浿", 90, 96), 
			new Student("�ſ��", 95, 93) 
	};
	// avg() �޼ҵ� �ۼ� ��ġ, #1
	public static double avg(Function<Student, Integer> operator) {
		int sum = 0;
		for (Student st : students) {
			sum += operator.apply(st);
		}
		double avg = (double) sum / students.length;
		return avg;
	}
	
	
	public static void main(String[] args) {
		double englishAvg = avg(Student::getEnglishScore);
		System.out.println("���� ��� ����: " + englishAvg);
		double mathAvg = avg(Student::getMathScore);
		System.out.println("���� ��� ����: " + mathAvg);
	}

	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;

		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}

		public String getName() {
			return name;
		}

		public int getEnglishScore() {
			return englishScore;
		}

		public int getMathScore() {
			return mathScore;
		}
	}
}
