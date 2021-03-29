package chap05.verify;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();
			// 작성 위치
			switch(selectNo) {
			case 1:
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
				break;
			case 3:
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
				break;
			case 4:
				int maxScore = -1;
				int sum = 0;
				double avg;
				
				for(int score : scores) {
					if(score > maxScore) maxScore = score;
					sum += score;
				}
				avg = sum /(double)scores.length;
				System.out.println("최고 점수: " + maxScore);
				System.out.println("평균 점수: " + avg);
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
