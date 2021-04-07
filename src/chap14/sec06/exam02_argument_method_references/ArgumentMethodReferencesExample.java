package chap14.sec06.exam02_argument_method_references;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {
	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;
		
		function = (a, b) -> a.compareToIgnoreCase(b);
		System.out.println(function.applyAsInt("java8", "JAVA8"));
		
		function = (a, b) -> a.compareToIgnoreCase(b);
		System.out.println(function.applyAsInt("java8", "JAVA8"));
	}
}
