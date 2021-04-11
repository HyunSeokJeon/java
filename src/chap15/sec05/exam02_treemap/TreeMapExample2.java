package chap15.sec05.exam02_treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");
		
		Set<Map.Entry<Integer, String>> descendingEntrySet = scores.descendingMap().entrySet();
		for (Map.Entry<Integer, String> entry : descendingEntrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
		
	}
}
