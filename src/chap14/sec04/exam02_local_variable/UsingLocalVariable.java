package chap14.sec04.exam02_local_variable;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		// arg = 31;  // ���ٽ��� �̿��� ���� arg �� finalƯ�� - �����Ұ�
		// localVar = 31;  // ���ٽ��� �̿��� ���� arg �� finalƯ�� - �����Ұ�
		
		// ���ٽ�
		MyFunctionalInterface fi = () -> {
			// ���� ���� �б�
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar);
		};
		fi.method();
	}
}
