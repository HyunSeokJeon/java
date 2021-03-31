package chap11.sec13.exam02_random;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		int a = (int)(Math.random()*1000000);
		System.out.println(a);
		Random random = new Random(a);
		
		System.out.println("선택 번호: ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.println(selectNumber[i]);
		}
	}
}
