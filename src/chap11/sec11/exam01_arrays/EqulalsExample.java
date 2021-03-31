package chap11.sec11.exam01_arrays;

import java.util.Arrays;

public class EqulalsExample {
	public static void main(String[] args) {
		int[][] original = {{1, 2}, {3, 4}}; // 2x2 배열
		
		// 얕은 복사 후 비교
		int[][] cloned1 = Arrays.copyOf(original, original.length); // 얕은 복사
		System.out.println("배열 번지 비교: " + original.equals(cloned1));
		
		System.out.println("1차 배열 항복 값 비교: " + Arrays.equals(original,  cloned1));
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned1));
		
		// 얕은 복사 증명
		System.out.println("중첩 배열 번지값 비교: " + original[0].equals(cloned1[0]));
		
		original[0][0] = 1000;
		System.out.println(original[0][0] +" "+ cloned1[0][0]);
	}
}
