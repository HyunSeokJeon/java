package chap10.sec03_try_catch_finally;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			// 예외 발생 가능한 코드
			Class clazz = Class.forName("java.lang.String2");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}finally {
			
		}
	}
}
