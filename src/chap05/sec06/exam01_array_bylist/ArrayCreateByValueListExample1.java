package chap05.sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87, 12, 33, 13, 232, 1123,12 ,22};
		
		System.out.println("scores[0] = " + scores[0]);
		System.out.println("scores[1] = " + scores[1]);
		System.out.println("scores[2] = " + scores[2]);
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("รัวี:" + sum);
	}
}
