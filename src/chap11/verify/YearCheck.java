package chap11.verify;

import java.util.*;

public class YearCheck {
	public static void main(String[] args) {
		System.out.println("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		GregorianCalendar gc = new GregorianCalendar();
		String nyean = gc.isLeapYear(year) ? "윤년" : "평년";
		System.out.printf("%d년도는 %s입니다.", year, nyean);
		
	}
}
