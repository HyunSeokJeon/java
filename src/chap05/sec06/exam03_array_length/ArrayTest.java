package chap05.sec06.exam03_array_length;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		int max = 0, min = 0;
		int[] s = new int[5];
		System.out.println("���� 5���� �Է� �ϼ���?");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < s.length; i++) {
			s[i] = sc.nextInt();
			
			if(i == 0) {
				max = s[i];
				min = s[i];
			}
			
			if(s[i] > max) {
				max = s[i];
			}
			if(s[i] < min) {
				min = s[i];
			}
		}
		
		System.out.println("max=" + max);
		System.out.println("min=" + min);
	}
}
