package chap07.sec07.exam03_casting;


public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// ���������� ���
//		parent.field2;
//		parent.method3();
		
		Child child = (Child) parent;
		//���������� Ȯ��
		child.field2 = "yy";
		child.method3();
	}
}
