package chap10.sec07_user_define_exception;

public class Account {
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money; 
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if (balance < money) {
			throw new BalanceInsufficientException("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù. ÀÜ¾× : " + balance);
		}
		balance -= money;
	}
}
