package chap07.sec04.exam01_overriding;

public class Computer extends Calculator {
	
	// ������̼� : �����Ϸ����� �ڵ�(�����ǿ���)�� ������ ��û�Ѵ�.
	@Override
	//�޼ҵ� ������(overriding)
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
	
	
}
