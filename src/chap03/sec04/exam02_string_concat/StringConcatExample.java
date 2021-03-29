package chap03.sec04.exam02_string_concat;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		System.out.println(str1);
		
		String str2 = "JDK" + 3 + 3.0;
		System.out.println(str2);
		
		String str3 = 3 + 3.0 + "JDK";
		System.out.println(str3);
	}
}
