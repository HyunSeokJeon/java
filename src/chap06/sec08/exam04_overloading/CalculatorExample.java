package chap06.sec08.exam04_overloading;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		
		// ���簢���� ���� ���ϱ�
		double result1 = myCal.areaRectangle(10);
		// ���簢���� ���� ���ϱ�
		double result2 = myCal.areaRectangle(10, 20);
		
		System.out.println(result1);
		System.out.println(result2);
	}
}
