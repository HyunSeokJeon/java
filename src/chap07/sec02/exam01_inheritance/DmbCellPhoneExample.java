package chap07.sec02.exam01_inheritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		// DmbCellPhone ��ü ����
		DmbCellPhone dmb = new DmbCellPhone("�ڹ���", "����", 10);
		
		// CellPhone���κ��� ��� ���� �ʵ�
		System.out.println("��: " + dmb.model);
		System.out.println("����: " + dmb.color);
		
		// DmbCellPhone�� �ʵ�
		System.out.println("ä��: " + dmb.channel);
		
		// CellPhone���κ��� �������� �޼ҵ� ȣ��
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("��������");
		dmb.recieveVoice("�ȳ��ϼ���!");
		dmb.sendVoice("������ħ!");
		dmb.hangUp();
		
		// DmbCellPhone�� �޼ҵ� ȣ��
		dmb.turnOnDmb();
		dmb.changeChannel(12);
		dmb.turnOffDmb();
		
		
		
		
		
		
	}
}
