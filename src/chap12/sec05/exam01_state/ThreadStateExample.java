package chap12.sec05.exam01_state;

public class ThreadStateExample {
	public static void main(String[] args) {
		StatePrintThread spt = new StatePrintThread(new TargetThread());
		spt.start();
	}
}
