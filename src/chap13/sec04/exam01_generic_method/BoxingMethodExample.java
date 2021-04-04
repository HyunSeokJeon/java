package chap13.sec04.exam01_generic_method;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int boxInt = box1.get();
		
		Box<String> box2 = Util.<String>boxing("box");
		String boxString = box2.get();
	}
}
