package chap13.sec02.exam01_none_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("String");
		String name = (String) box.get();
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
		// generic Ÿ���� ������� ������ Ÿ�� ��ȯ�� ����ϰ� �Ͼ
		// ��� : ���ҽ� �ս�
	}
}