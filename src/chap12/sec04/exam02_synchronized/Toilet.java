package chap12.sec04.exam02_synchronized;

// key�� �̿��ؼ� Thread���� �浹�� �Ͼ�� �ʵ��� ��������� �´��� ���� 
// Thread�� ����ȭ(Synchronization)��� �Ѵ�.
public class Toilet { // ȭ����� ����ϴ� ������ �����ִ� Ŭ����
	
	// �޼ҵ��� ����ȭ ���
	// synchronized�� ����� opendDoor() �޼ҵ�� �ѹ� ������ ������ ���� ������ ������.
	// �ٸ� Thread���� �Ѱ��� Thread�� �� �޼ҵ��� ������ ������ ���� �����.
	public synchronized void openDoor(String name, boolean b) {
		if (b == false) {
			System.out.println(name);
			usingTime();
			System.out.println("ȭ��� ��� ����!");
		}else {
			System.out.println("ȭ��� �����!");
		}
	} // openDoor() end
	
	public void usingTime() { // ȭ��� ����ϴ� �ð�
		for (int i = 0; i < 100000000; i++) {
			if(i == 10000) {
				System.out.println("�ذ�");
			}
		}
	} //usingTime() end
	
}
