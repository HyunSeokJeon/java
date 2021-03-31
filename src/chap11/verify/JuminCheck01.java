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

		System.out.println("주민번호 앞자리를 입력 하세요?");
		String jumin1 = sc.next(); // 111111
		System.out.println("주민번호 뒷자리를 입력 하세요?");
		String jumin2 = sc.next(); // 1111011
		
		if (jumin1.length() != 6) {
			System.out.println("주민번호 앞자리는 6자리 입력");
		} else if (jumin2.length() != 7) {
			System.out.println("주민번호 뒷자리는 7자리 입력");
		} else if (!jc.juminCheck(jumin1 + jumin2)) {
			System.out.println("잘못된 주민번호 입니다.");
		} else {
			System.out.println("올바른 주민번호 입니다");
		}
	}
}
