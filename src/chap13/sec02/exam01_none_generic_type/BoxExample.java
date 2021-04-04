package chap13.sec02.exam01_none_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("String");
		String name = (String) box.get();
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
		// generic 타입을 사용하지 않으면 타입 변환이 빈번하게 일어남
		// 결론 : 리소스 손실
	}
}
