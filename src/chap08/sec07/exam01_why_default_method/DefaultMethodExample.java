package chap08.sec07.exam01_why_default_method;

public class DefaultMethodExample {
	public static void main(String[] args) {
		MyInterface m1 = new MyclassA();
		m1.method1();
		MyInterface m2 = new MyclassB();
		m2.method1();
		m2.method2();
		MyInterface[] aa = new MyInterface[5];
	}
	
}
