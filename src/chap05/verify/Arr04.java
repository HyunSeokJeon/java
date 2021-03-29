package chap05.verify;

public class Arr04 {
	public static void main(String[] args) {
		int[][] score = { 
				{ 85, 60, 70 }, // 0 행
				{ 90, 95, 80 }, // 1 행
				{ 75, 80, 100 }, // 2 행
				{ 80, 70, 95 }, // 3 행
				{ 100, 65, 80 } // 4 행
		};
		int[] subject = new int[3]; // 과목총점 저장
		int[] student = new int[5]; // 학생의 총점 저장
		String[] subName = { "국어:", "영어:", "수학:" };
		String[] stuName = { "1번학생:", "2번학생:", "3번학생:", "4번학생:", "5번학생:" };
		// subject[0]=0, student[0]=0;
		int r, c;
		System.out.println("각 과목별 총점구하기 ");
		// 이곳에 코드를 추가합니다.
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
		System.out.println("학생별 총점구하기");
		// 이곳에 코드를 추가합니다.
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
