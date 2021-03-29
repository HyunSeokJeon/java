package chap07.sec06.exam01_protected.package2;

import chap07.sec06.exam01_protected.package1.A;

public class D extends A{
	public D() {
		this.field = "value";
		this.method();
	}
	@Override
	protected void method() {
		
	}
	
}
