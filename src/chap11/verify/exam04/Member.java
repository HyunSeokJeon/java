package chap11.verify.exam04;

public class Member {
	private String id;
	private String name;

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	// �ۼ� ��ġ

	@Override
	public String toString() {
		return id + ": " + name;
	}
	
}