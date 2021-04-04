package chap13.sec06.exam01_generic_wildcard;

public class Person<T> {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}
