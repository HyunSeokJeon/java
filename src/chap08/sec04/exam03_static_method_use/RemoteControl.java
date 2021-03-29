package chap08.sec04.exam03_static_method_use;

public interface RemoteControl {
	// �������̽��� �������
	
	// 1. ���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 2. �߻�޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 3. ����Ʈ�޼ҵ�
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	// 4. �����޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ü�մϴ�.");
	}
}
