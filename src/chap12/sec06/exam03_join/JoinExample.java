package chap12.sec06.exam03_join;

public class JoinExample {
	public static void main(String[] args) {
		SumThread t1 = new SumThread();
		t1.setSum(0);

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {

		}
		System.out.println(t1.getSum());

	}

}