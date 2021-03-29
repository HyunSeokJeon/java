package chap02.sec02.exam07_ref;

public class Reference {
	public static void main(String[] args) {
		String str1 = "new";
		String str2 = "new";
		String str3 = new String("new");
		
		boolean a = str1 == str2;
		boolean b = str2 == str3;
		boolean c = str1 == str3;
		
		boolean d = str3.equals(str1);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
}
