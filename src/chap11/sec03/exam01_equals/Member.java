package chap11.sec03.exam01_equals;

public class Member extends Object{
	public String id;
	
	Member(String id){
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj; // 강제 타입변환
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	
}
