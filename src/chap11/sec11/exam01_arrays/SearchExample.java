package chap11.sec11.exam01_arrays;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		
		System.out.println("Ã£´Â ÀÎµ¦½º: " + index);
	}
}
