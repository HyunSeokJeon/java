package chap10.sec07_user_define_exception;

public class AccountExample {
	public static void main(String[] args) {
		Account ac = new Account();
		// �����ϱ�
		ac.deposit(10000);
		System.out.println("���ݾ�: " + ac.getBalance());
		
		// ����ϱ�
		try {
			ac.withdraw(20000);
		}catch(BalanceInsufficientException e) {
			System.out.println(e.getMessage());
			e.printStackTrace(); // ���ܰ�ü�� ���� �ڼ��� ����(�޽���, ����Ŭ����, ��ġ)�� ������ش�.
		}
	}
}	
