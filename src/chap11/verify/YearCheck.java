package chap11.verify;

import java.util.*;

public class YearCheck {
	public static void main(String[] args) {
		System.out.println("������ �Է� �ϼ���?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		GregorianCalendar gc = new GregorianCalendar();
		String nyean = gc.isLeapYear(year) ? "����" : "���";
		System.out.printf("%d�⵵�� %s�Դϴ�.", year, nyean);
		
	}
}
