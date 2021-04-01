package chap12.verify.exam00;

// 인터페이스 Runnable를 구현
public class MyRun implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 500; i++) {
			System.out.print("S");
		}
	}
	

}
