package chap11.verify.exam08;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		// �ۼ� ��ġ
		// #1: split() �޼ҵ� �̿�
		String[] a = str.split(",");
		for(String n : a) {
			System.out.println(n);
		}
		System.out.println();
		// #2: StringTokenizer �̿�
		StringTokenizer b = new StringTokenizer(str, ",");
		int count = b.countTokens();
		for(int i = 0; i < count; i++) {
			String c = b.nextToken();
			System.out.println(c);
		}
	}
}