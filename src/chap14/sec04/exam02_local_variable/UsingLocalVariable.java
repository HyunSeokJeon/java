package chap14.sec04.exam02_local_variable;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		// arg = 31;  // 람다식이 이용한 변수 arg 는 final특성 - 수정불가
		// localVar = 31;  // 람다식이 이용한 변수 arg 는 final특성 - 수정불가
		
		// 람다식
		MyFunctionalInterface fi = () -> {
			// 로컬 변수 읽기
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar);
		};
		fi.method();
	}
}
