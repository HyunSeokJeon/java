package chap15.verify.exam07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	private List<Board> boardList = new ArrayList<Board>();;

	public BoardDao() {
		for (int i = 1; i <= 3; i++) {
			boardList.add(new Board("����"+Integer.toString(i), "����"+Integer.toString(i)));
		}
	}

	public List<Board> getBoardList() {
		return boardList;
	}
}
