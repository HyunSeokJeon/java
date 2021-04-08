package chap15.sec04.exam01_hashmap;

public class Student {
	public int sno;
	public String name;
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (student.sno == sno) && (student.name.equals(name));
		}
		return false;
	}
	
	
}
