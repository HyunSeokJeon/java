package chap15.verify.board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {
	
	ArrayList<BoardVO> boardList;
	
	public BoardSVC() {
		boardList = new ArrayList();
	}
	
	public void writeArticle(Scanner sc) {
		System.out.println("�Խ��ǿ� ���� �ۼ��ϼ���");
		System.out.print("�ۼ���: ");
		String register = sc.next();
		
		System.out.print("�̸���: ");
		String email = sc.next();

		System.out.print("��й�ȣ: ");
		String passwd = sc.next();
		
		System.out.print("����: ");
		String subject = sc.next();
		
		System.out.print("�۳���: ");
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
			System.out.println("��ϵ� ���� �����ϴ�.");
		}
	}
	
	public void removearticle(Scanner sc) {
		// boardList�� ��������� ��������
		if (boardList.size() == 0) {
			System.out.println("������ ���� �����ϴ�");
			return;
		}
		// �ܼ� ��°� ����ڷ� ���� �Է¹���
		System.out.println("������ ���� �ۼ��ڿ� ��й�ȣ�� �Է��ϼ���.");
		System.out.print("�ۼ���: ");
		String register = sc.next();
		System.out.print("��й�ȣ: ");
		String passwd = sc.next();
		
		boolean deleteY = false; // ������ �̷�� ������ Ȯ��
		
		// boardList�� ���鼭 ������ ������ delectList�� boardList�� �ε����� ����
		ArrayList<Integer> deleteList = new ArrayList<Integer>();
		for(int i = 0; i< boardList.size(); i++) {
			if((boardList.get(i).getRegister().equals(register)) 
				&& (boardList.get(i).getPasswd().equals(passwd))){
				deleteList.add(i);
				deleteY = true;
			}
		}
		
		// ArrayList�� ���� �ε������� �����Ұ�� �ε����� ������ ������� ����
		// ���� �޿��� �ε����� ����ִ� deleteList�� �ڿ��� ���� �ε����� �ҷ��� ����
		for(int j = deleteList.size()-1; j >= 0; j--) {
			int index = deleteList.get(j);
			boardList.remove(index);
		}
		if(deleteY) {
			System.out.println("���������� ���� ���� �Ǿ����ϴ�.");
		}else {
			System.out.println("�ش� �ۼ��ڰ� ���ų� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
	}
}
