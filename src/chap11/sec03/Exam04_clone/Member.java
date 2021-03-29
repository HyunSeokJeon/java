package chap11.sec03.Exam04_clone;

public class Member implements Cloneable{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	// clone()�޼ҵ带 �̿��Ͽ� ��ü�� �����Ѵ�.
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) this.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
