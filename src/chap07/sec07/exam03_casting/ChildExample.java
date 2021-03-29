package chap07.sec07.exam03_casting;


public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// 참조영역의 축소
//		parent.field2;
//		parent.method3();
		
		Child child = (Child) parent;
		//참조영역의 확대
		child.field2 = "yy";
		child.method3();
	}
}
