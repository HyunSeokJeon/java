package chap12.sec04.exam02_synchronized;
	
// 5���� Thread�� ����� ���� ��Ű�� Ŭ����
public class ManageToilet {
	public static void main(String[] args) {
		Toilet t = new Toilet();
		
		// thread ����
		Family father = new Family("�ƹ���", t);
		Family mother = new Family("��Ӵ�", t);
		Family sister = new Family("����", t);
		Family brother = new Family("��", t);
		Family me = new Family("��", t);
		
		
		// ��  Thread�� Runnable ���¿� ��
		
		father.start();
		mother.start();
		sister.start();
		brother.start();
		me.start();
		
	}
}
