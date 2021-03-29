package chap02.sec01.exam01_variable;

public class VariableExample1 {
	public static void main(String[] args) {
		// 지역 변수(local variable)
		int value;
		
		// 변수 사용(저장 하기)
		value = 10;
		
		// 변수 사용(읽어 오기)
		int result = value + 10;
		// The local variable value may not have been initialized
		
		System.out.println(result);
	}
}
