package chap15.verify.board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {
	
	ArrayList<BoardVO> boardList;
	
	public BoardSVC() {
		boardList = new ArrayList();
	}
	
	public void writeArticle(Scanner sc) {
		System.out.println("게시판에 글을 작성하세요");
		System.out.print("작성자: ");
		String register = sc.next();
		
		System.out.print("이메일: ");
		String email = sc.next();

		System.out.print("비밀번호: ");
		String passwd = sc.next();
		
		System.out.print("제목: ");
		String subject = sc.next();
		
		System.out.print("글내용: ");
		String content = sc.next();
		
		BoardVO newArticle = new BoardVO(register, subject, email, content, passwd);
		addArticle(newArticle);
	}
	
	public void addArticle(BoardVO newArticle) {
		boardList.add(newArticle);
	}
	
	public void listArticle(Scanner sc) {
		if(boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println(boardList.get(i).toString());
				
			}
		}else {
			System.out.println("등록된 글이 없습니다.");
		}
	}
	
	public void removearticle(Scanner sc) {
		// boardList가 비어있으면 돌려보냄
		if (boardList.size() == 0) {
			System.out.println("삭제할 글이 없습니다");
			return;
		}
		// 콘솔 출력과 사용자로 부터 입력받음
		System.out.println("삭제할 글의 작성자와 비밀번호를 입력하세요.");
		System.out.print("작성자: ");
		String register = sc.next();
		System.out.print("비밀번호: ");
		String passwd = sc.next();
		
		boolean deleteY = false; // 삭제가 이루어 졌는지 확인
		
		// boardList를 돌면서 조건이 맞으면 delectList에 boardList의 인덱스를 저장
		ArrayList<Integer> deleteList = new ArrayList<Integer>();
		for(int i = 0; i< boardList.size(); i++) {
			if((boardList.get(i).getRegister().equals(register)) 
				&& (boardList.get(i).getPasswd().equals(passwd))){
				deleteList.add(i);
				deleteY = true;
			}
		}
		
		// ArrayList의 앞의 인덱스부터 삭제할경우 인덱스가 앞으로 당겨지는 문제
		// 제일 뒷열을 인덱스를 담고있는 deleteList의 뒤에서 부터 인덱스를 불러와 삭제
		for(int j = deleteList.size()-1; j >= 0; j--) {
			int index = deleteList.get(j);
			boardList.remove(index);
		}
		if(deleteY) {
			System.out.println("성공적으로 글이 삭제 되었습니다.");
		}else {
			System.out.println("해당 작성자가 없거나 비밀번호가 일치하지 않습니다.");
		}
	}
}
