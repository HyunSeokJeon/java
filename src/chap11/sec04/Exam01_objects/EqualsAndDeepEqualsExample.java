package chap11.sec04.Exam01_objects;

import java.util.Objects;

public class EqualsAndDeepEqualsExample {
	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		
		// Objects.equals
		System.out.println(Objects.equals(o1, o2));
		
		Integer[] arr1 = {1, 2};
		Integer[] arr2 = {1, 2};
		
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(arr1.equals(arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));
		
	}
}
