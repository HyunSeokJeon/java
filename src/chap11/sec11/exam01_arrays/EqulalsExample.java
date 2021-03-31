package chap11.sec11.exam01_arrays;

import java.util.Arrays;

public class EqulalsExample {
	public static void main(String[] args) {
		int[][] original = {{1, 2}, {3, 4}}; // 2x2 �迭
		
		// ���� ���� �� ��
		int[][] cloned1 = Arrays.copyOf(original, original.length); // ���� ����
		System.out.println("�迭 ���� ��: " + original.equals(cloned1));
		
		System.out.println("1�� �迭 �׺� �� ��: " + Arrays.equals(original,  cloned1));
		System.out.println("��ø �迭 �׸� ��: " + Arrays.deepEquals(original, cloned1));
		
		// ���� ���� ����
		System.out.println("��ø �迭 ������ ��: " + original[0].equals(cloned1[0]));
		
		original[0][0] = 1000;
		System.out.println(original[0][0] +" "+ cloned1[0][0]);
	}
}
