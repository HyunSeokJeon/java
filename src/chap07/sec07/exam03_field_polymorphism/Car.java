package chap07.sec07.exam03_field_polymorphism;

public class Car {
	// �ʵ�
	Tire frontLeftTire = new Tire("�տ���", 6);
	Tire frontRightTire = new Tire("�տ�����", 2);
	Tire backLeftTire = new Tire("�ڿ���", 3);
	Tire backRightTire = new Tire("�ڿ�����", 4);
	
	// ������
	// �޼ҵ�
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		int i = 0;
		if(frontLeftTire.roll() == false) {
			stop();
			i= 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			i= 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			i= 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			i= 4;
		}
		return i;
	}
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
