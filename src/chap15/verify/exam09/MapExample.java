package chap15.verify.exam09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		
		int sum = 0;
		int cnt = 0;
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			if (maxScore < value) {
				maxScore = value;
				name = key;
			}
			sum += value;
			cnt ++;
		}
		System.out.println("평균점수: " + sum/cnt);
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
		
	}
}