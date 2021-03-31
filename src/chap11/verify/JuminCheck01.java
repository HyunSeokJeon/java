package chap11.verify;

import java.io.InputStream;
import java.util.Scanner;

public class JuminCheck01 {
	public boolean juminCheck(String jumin) {
		int sum = 0;
		int constant = 2; 
		for (int i = 0; i < 12; i++) {
			sum += Integer.parseInt(jumin.substring(i, i+1)) * constant;			
			constant++;
			if(constant > 9) {
				constant = 2;
			}
		}
		int checkNum = Integer.parseInt(jumin.substring(12));
		
		int remainder = 11 - sum % 11;
		if (remainder >= 10) {
			remainder = remainder%10;
		}
		
		if (checkNum == remainder) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		JuminCheck01 jc = new JuminCheck01();

		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ���?");
		String jumin1 = sc.next(); // 111111
		System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ���?");
		String jumin2 = sc.next(); // 1111011
		
		if (jumin1.length() != 6) {
			System.out.println("�ֹι�ȣ ���ڸ��� 6�ڸ� �Է�");
		} else if (jumin2.length() != 7) {
			System.out.println("�ֹι�ȣ ���ڸ��� 7�ڸ� �Է�");
		} else if (!jc.juminCheck(jumin1 + jumin2)) {
			System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
		} else {
			System.out.println("�ùٸ� �ֹι�ȣ �Դϴ�");
		}
	}
}
