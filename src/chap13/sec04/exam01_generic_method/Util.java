package chap13.sec04.exam01_generic_method;

public class Util {
	public static <T> Box<T> boxing(T t){
		//					 boxing(T t) : generic타입 T를 매개변수로 갖는 메소드 선언
		//            Box<T>: 메소드의 리턴 타입
		//        <T> : 사용하는 generic
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}
}
