package chap06.sec08.exam01_method_declaration;

public class ComputerExample {
	public static void main(String[] args) {
		Computer com = new Computer();
		int[] values1 = {1, 2, 3};
		int result1 = com.sum(values1);
		System.out.println(result1);
		
		int result2 = com.sum(new int[] {1,2,3,4,5});
		System.out.println(result2);
		
		int result3 = com.sum2(1,2,3,4,5);
		System.out.println(result3);
		
		int result4 = com.sum2(1,2,3);
		System.out.println(result4);
		
	}
}
