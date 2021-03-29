package chap10.sec07_user_define_exception;

public class AccountExample {
	public static void main(String[] args) {
		Account ac = new Account();
		// 예금하기
		ac.deposit(10000);
		System.out.println("예금액: " + ac.getBalance());
		
		// 출금하기
		try {
			ac.withdraw(20000);
		}catch(BalanceInsufficientException e) {
			System.out.println(e.getMessage());
			e.printStackTrace(); // 예외객체에 대한 자세한 정보(메시지, 예외클래스, 위치)를 출력해준다.
		}
	}
}	
