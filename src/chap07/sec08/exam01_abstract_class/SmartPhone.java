package chap07.sec08.exam01_abstract_class;

public class SmartPhone extends Phone {

	
	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void turnOff() {
		System.out.println("스마트폰 전원을 끕니다.");
		
	}
	public void internetSearch() {
		System.out.println("인터넷검색을 합니다.");
	}

}
