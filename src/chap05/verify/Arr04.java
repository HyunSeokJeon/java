package chap05.verify;

public class Arr04 {
	public static void main(String[] args) {
		int[][] score = { 
				{ 85, 60, 70 }, // 0 ��
				{ 90, 95, 80 }, // 1 ��
				{ 75, 80, 100 }, // 2 ��
				{ 80, 70, 95 }, // 3 ��
				{ 100, 65, 80 } // 4 ��
		};
		int[] subject = new int[3]; // �������� ����
		int[] student = new int[5]; // �л��� ���� ����
		String[] subName = { "����:", "����:", "����:" };
		String[] stuName = { "1���л�:", "2���л�:", "3���л�:", "4���л�:", "5���л�:" };
		// subject[0]=0, student[0]=0;
		int r, c;
		System.out.println("�� ���� �������ϱ� ");
		// �̰��� �ڵ带 �߰��մϴ�.
		r = 0;
		for(int[] studentNum : score) {
			c = 0;
			for(int sc : studentNum) {
				subject[c] += sc;
				c++;
			}
		}
		for(String sbName : subName) {
			System.out.println(sbName+subject[r]);
			r++;
		}
		System.out.println();
		System.out.println("�л��� �������ϱ�");
		// �̰��� �ڵ带 �߰��մϴ�.
		r = 0;
		for(int[] studentNum : score) {
			c = 0;
			for(int j : studentNum) {
				c += j;
			}
			student[r] = c;
			System.out.println(stuName[r] + c);
			r++;
		}
		
		
		
		
	}
}
