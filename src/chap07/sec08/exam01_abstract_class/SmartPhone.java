package chap07.sec08.exam01_abstract_class;

public class SmartPhone extends Phone {

	
	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void turnOff() {
		System.out.println("����Ʈ�� ������ ���ϴ�.");
		
	}
	public void internetSearch() {
		System.out.println("���ͳݰ˻��� �մϴ�.");
	}

}
