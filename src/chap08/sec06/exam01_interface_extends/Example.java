package chap08.sec06.exam01_interface_extends;

public class Example {
	public static void main(String[] args) {
		ImplementationC c = new ImplementationC();
		InterfaceA ia = c;
		ia.methodA();
		
		InterfaceB ib = c;
		ib.mathodB();
		
		InterfaceC ic = c;
		ic.methodA();
		ic.mathodB();
		ic.methodC();
	}
}
