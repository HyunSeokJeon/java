package chap14.sec06.exam03_constructor_references;

public class Member {
	private String name;
	private String id;
	
	
	public Member() {
		super();
	}
	public Member(String id) {
		super();
		this.id = id;
	}
	public Member(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
