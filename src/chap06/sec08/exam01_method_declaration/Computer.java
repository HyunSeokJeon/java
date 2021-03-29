package chap06.sec08.exam01_method_declaration;

public class Computer {
	// 클래스의 구성 맴버
	// 1. 필드
	// 2. 생성자
	// 3. 메소드
	int sum(int[] values) {
		int sum = 0;
		for(int value : values) {
			sum += value;
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int value : values) {
			sum += value;
		}
		return sum;
	}
}
