package chap06.sec08.exam01_method_declaration;

public class Computer {
	// Ŭ������ ���� �ɹ�
	// 1. �ʵ�
	// 2. ������
	// 3. �޼ҵ�
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
