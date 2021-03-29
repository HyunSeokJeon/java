package chap11.sec05.Exam01_exit;

public class ExitExample {
	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager() {

			@Override
			public void checkExit(int status) {
				if(status != 5) {
					throw new SecurityException();
				}
			}
			
		});
		
		System.out.println("프로그램을 종료합니다.");
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				System.exit(i);
			} catch(SecurityException e) {
				
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
