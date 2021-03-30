package chap11.verify.exam08;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		// 작성 위치
		// #1: split() 메소드 이용
		String[] a = str.split(",");
		for(String n : a) {
			System.out.println(n);
		}
		System.out.println();
		// #2: StringTokenizer 이용
		StringTokenizer b = new StringTokenizer(str, ",");
		int count = b.countTokens();
		for(int i = 0; i < count; i++) {
			String c = b.nextToken();
			System.out.println(c);
		}
	}
}