package chap11.sec07.exam02_method;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1234123";
		char gender = ssn.charAt(7);
		switch(gender) {
		case '1':
		case '3':
			System.out.println("�����Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("�����Դϴ�.");
			break;
		}
	}
}
