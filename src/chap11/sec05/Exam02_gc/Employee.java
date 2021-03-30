package chap11.sec05.Exam02_gc;

public class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.printf("Employye(%d)가 메모리에 생성됨\n", eno);
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.printf("Employee(%d)가 메모리에 제거됨\n", eno);
	}
	
	
}
