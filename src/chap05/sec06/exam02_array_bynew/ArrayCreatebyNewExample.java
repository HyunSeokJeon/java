package chap05.sec06.exam02_array_bynew;

public class ArrayCreatebyNewExample {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		String[] arr2 = new String[3];
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "]=" + arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "]=" + arr1[i]);
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}
		arr2[0] = "1¿ù";
		arr2[1] = "2¿ù";
		arr2[2] = "3¿ù";
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}
	}
}
