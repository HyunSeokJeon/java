package chap04.verify;

import java.util.Scanner;

public class DoWhileExample1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1~100 ������ ��
		int ran = (int)(Math.random()*100) + 1;
		int cnt = 0, inNum =0;
		System.out.println("1~100 ���ڸ��߱� �����Դϴ�.");
		System.out.println("���ڸ� �Է��ϼ���");
		do {
			inNum = sc.nextInt();
			if(inNum > ran) {
				System.out.println("���� ���� �Է��ϼ���");
			} else if(inNum < ran) {
				System.out.println("ū ���� �Է��ϼ���");
			}
			cnt++;
					
		} while(!(inNum == ran));
		//...
		System.out.println(cnt+"���� ���ƽ��ϴ�.");
		sc.close();
	}
}
