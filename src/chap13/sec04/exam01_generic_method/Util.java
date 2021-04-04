package chap13.sec04.exam01_generic_method;

public class Util {
	public static <T> Box<T> boxing(T t){
		//					 boxing(T t) : genericŸ�� T�� �Ű������� ���� �޼ҵ� ����
		//            Box<T>: �޼ҵ��� ���� Ÿ��
		//        <T> : ����ϴ� generic
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}
}
