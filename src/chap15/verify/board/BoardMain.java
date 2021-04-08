package chap15.verify.board;

import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardSVC boardSVC = new BoardSVC();
		
		
		boolean push4 = true;
		while(push4) {
			System.out.println();
			System.out.println("메뉴를 입력 하세요");
			System.out.println("1.게시판 글쓰기");
			System.out.println("2.글 목록 보기");
			System.out.println("3.글 삭제");
			System.out.println("4.종료");
			String menu = sc.next();
			switch(menu) {
			case "1":
				boardSVC.writeArticle(sc);
				break;
			case "2":
				boardSVC.listArticle(sc);
				break;
			case "3":
				boardSVC.removearticle(sc);
				break;
			case "4":
				push4 = false;
				break;
				
			}
			
			
		}
		
	}
}
