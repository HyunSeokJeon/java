package chap07.sec08.exam02_abstract_method;

public abstract class Animal {
	
	// 1. �ʵ�
	public String kind;
	
	// 2. ������
	
	// 3. �߻� �޼ҵ�
	public abstract void sound();
	// 4. �Ϲ� �޼ҵ�
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
}
