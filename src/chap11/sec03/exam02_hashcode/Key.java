package chap11.sec03.exam02_hashcode;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// ������ȯ ���������� Ȯ��
		if(obj instanceof Key) {
			//���� ��ȯ
			Key key = (Key) obj;
			
			// number���� ������ ���� ��ü�� �Ǵ��ϰڴ�.
			if(number == key.number) {
				return true;
			}
		}
		// ������ȯ �Ұ� or number ���� �ٸ��� �ٸ���ü�� �Ǵ�
		return false;
	}

	@Override
	public int hashCode() {
		return number;
	}
	
}
