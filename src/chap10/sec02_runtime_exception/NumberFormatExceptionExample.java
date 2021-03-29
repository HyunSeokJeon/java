package chap10.sec02_runtime_exception;


public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "100a";
		
		int value1 = Integer.parseInt(data1);
		try {
			int value2 = Integer.parseInt(data2);
		} catch( NumberFormatException e ){
			for (char a : data2.toCharArray()) {
				String b = null;
				
				b += a;
			}
		}
	}
}
