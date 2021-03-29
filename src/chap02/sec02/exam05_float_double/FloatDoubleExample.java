package chap02.sec02.exam05_float_double;

public class FloatDoubleExample {
	public static void main(String[] args) {
		
		double var1 = 3.14;
//		float var2 = 3.14
		/*	
		 	Multiple markers at this line
			- Type mismatch: cannot convert from double to float
			- Syntax error, insert ";" to complete 
			 LocalVariableDeclarationStatement
		 */
		// 작은 값에 큰 값을 넣어버려서 오류 overflow
		float var2 = 3.14F;
		
		System.out.println(var1);
		System.out.println(var2);
		
		float var3 = 3e6f;
		double var4 = 3e6;
		System.out.println(var3);
		System.out.println(var4);
	}
	
}
