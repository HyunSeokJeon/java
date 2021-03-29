package chap11.sec03.exam02_hashcode;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// 강제변환 가능한지를 확인
		if(obj instanceof Key) {
			//강제 변환
			Key key = (Key) obj;
			
			// number값이 같으면 같은 객체로 판단하겠다.
			if(number == key.number) {
				return true;
			}
		}
		// 강제변환 불가 or number 값이 다르면 다른객체로 판단
		return false;
	}

	@Override
	public int hashCode() {
		return number;
	}
	
}
