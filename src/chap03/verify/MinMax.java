package chap03.verify;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		System.out.println("3���� ������ �Է� �ϼ���?");
		int n1, n2, n3, max, min;
		
		Scanner sc = new Scanner(System.in);
		
		// 3���� �Է°�
		n1 = sc.nextInt(); // ù��° �Է°�
		n2 = sc.nextInt(); // �ѹ�° �Է°�
		n3 = sc.nextInt(); // ����° �Է°�
		
		// n1, n2, n3 ���
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
		
		// �Ʒ��� �ڵ带 �ۼ��ϼ���
		max = (n1 > n2)?
				(n1 > n3 ? n1 : n3):
				(n2 > n3 ? n2 : n3);
		min = (n1 < n2)?
				(n1 < n3 ? n1 : n3):
				(n2 < n3 ? n2 : n3);
		
		max = n1 > n2 ? n1 : n2;
		max = max > n3 ? max : n3;
				
		System.out.println("max=" + max);
		System.out.println("min=" + min);
	}
}
