package chap13.sec02.exam02_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		Box<String> box2 = new Box<>();
		
		box.set("�̰��� �ڹٴ�");
		
		String string = box.get(); // generic�� ����ϸ鼭 Ÿ�� ��ȯ�� ������ ���
	}
	
}
