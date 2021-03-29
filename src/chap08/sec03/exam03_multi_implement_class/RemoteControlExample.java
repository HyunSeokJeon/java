package chap08.sec03.exam03_multi_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		SmartTelevision st = new SmartTelevision();
		
		RemoteControl rc = st;
		Searchable sear= st;
		
	}
}
