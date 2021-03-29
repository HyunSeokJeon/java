package chap04.sec03.exam04_break;

public class BreakExample {
	public static void main(String[] args) {
		while(true) {
			int num = (int) Math.ceil(Math.random() * 6);
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
