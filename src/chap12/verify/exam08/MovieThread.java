package chap12.verify.exam08;

public class MovieThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("�������� ����մϴ�.");
			// �ۼ� ��ġ
			try {
				sleep(1000);
				interrupt();
			} catch (InterruptedException e) {
				break;
			}
			
		}
		
	}
}
