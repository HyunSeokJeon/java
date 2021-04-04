package chap13.sec02.exam02_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		Box<String> box2 = new Box<>();
		
		box.set("이것이 자바다");
		
		String string = box.get(); // generic를 사용하면서 타입 변환이 없어진 모습
	}
	
}
