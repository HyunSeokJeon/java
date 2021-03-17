package sec01.exam01_variable;

public class VariableScopeExample {
	public static void main(String[] args) {
		int var1 = 15;
		
		if (var1 > 10) {
			int var2;
			var1 = 10;
			var2 = 20;
		}
		
		var1 = 11;
//		var2 = 21;
		//var2 cannot be resolved to a variable
	}
}
