package chap03.sec04.exam01_arithmetic;

public class AccuracyExample2 {
	public static void main(String[] args) {
		/*
		int apple = 1;
		int number = 7;
		int totalPieces = apple * 10;
		int temp = totalPieces - number;
		
		double result = temp / 10.0;
		
		System.out.println(result);
		*/
		
		// 10�� ������ ���� ��� ����Ѵ�
		int apple = 10;
		double pieceUnit = 1;
		int number = 7;
		double result = apple - number * pieceUnit;
		// ������� ���������� 10�� �����ش�
		result = result / 10;
		System.out.println(result);
	}
}
