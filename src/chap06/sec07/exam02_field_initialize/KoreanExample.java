package chap06.sec07.exam02_field_initialize;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("���ڹ�", "010110-2993918");
		Korean k2 = new Korean("���ڹ�", "109038-2949282");
		
		System.out.println("k1.name=" + k1.name);
		System.out.println("k1.ssn=" + k1.ssn);
		System.out.println("k2.name=" + k2.name);
		System.out.println("k2.ssn=" + k2.ssn);
		
	}
}
