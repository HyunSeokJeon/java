package chap06.sec08.exam04_overloading;

public class Calculator {
	// Ŭ������ ���� �ɹ�
	// 1. �ʵ�
	// 2. ������
	// 3. �޼ҵ�
	// ���簢���� ����

	double areaRectangle(double width) {
		return width * width;
	}

	// ���簢���� ����
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
