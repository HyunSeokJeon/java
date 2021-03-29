package chap04.sec03.exam03_dowhile;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		// Scanner 클래스 타입
		Scanner scanner = new Scanner(System.in);
		// String 클래스 타입
		String inputString;
		do {
			System.out.print(">");
			//표준입출력장치 (콘솔)에서 한줄을 입력받아 inputString 변수에 대입
			inputString = scanner.nextLine();
			System.out.println(inputString);
			
		} while(!inputString.equals("q"));
		System.out.println();
		System.out.println("프로그램종료");
		scanner.close();
	}
}
