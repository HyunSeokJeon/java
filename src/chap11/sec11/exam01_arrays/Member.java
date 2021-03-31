package chap11.sec11.exam01_arrays;

public class Member implements Comparable<Member>{ //객체를 정렬하려면 Comparable을 구현해야한다.
	
	String name;
	
	public Member(String name) {
		this.name = name;
		
	}
	
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
}
