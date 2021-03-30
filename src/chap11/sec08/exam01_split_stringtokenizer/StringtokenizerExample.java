package chap11.sec08.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringtokenizerExample {
	public static void main(String[] args) {
		String text = "È«±æµ¿/ÀÌ¼öÈ«/¹Ú¿¬¼ö";
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokins = st.countTokens();
		for(int i = 0; i < countTokins; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		
		
		
	}
}
