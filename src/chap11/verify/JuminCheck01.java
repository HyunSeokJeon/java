package chap11.verify;

import java.io.InputStream;
import java.util.Scanner;

public class JuminCheck01 {
	public boolean juminCheck(String jumin) {
		
		// (주민번호 각자리 * constant) 합
		int sum = 0;
		// 각 자리수에 곱해질 숫자
		int constant = 2; 
		for (int i = 0; i < 12; i++) {
			// char '숫자'값에 48(char에서 숫자가 시작하는 '0')을 뺀뒤('0'을 빼도 됨), int로 자동 변환되 같은 숫자 값을 얻어냄
			int x1 = (jumin.charAt(i)-'0') * constant;
			sum += x1;			
			
			constant++;
			// 곱해질 숫자가 9가 넘어가면 다시 2로 넘겨줌
			if(constant > 9) {
				constant = 2;
			}
		}
		
		// 마지막 자리 숫자
		int checkNum = jumin.charAt(12)-'0';
		
		// 나머지를 구하는 과정
		int remainder = 11 - sum % 11;
		if (remainder >= 10) {
			remainder = remainder%10;
		}
		
		// 올바른 번호인지 확인
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
