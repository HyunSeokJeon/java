package chap02.sec01.exam01_variable;

public class VariableExample1 {
	public static void main(String[] args) {
		// ���� ����(local variable)
		int value;
		
		// ���� ���(���� �ϱ�)
		value = 10;
		
		// ���� ���(�о� ����)
		int result = value + 10;
		// The local variable value may not have been initialized
		
		System.out.println(result);
	}
}
