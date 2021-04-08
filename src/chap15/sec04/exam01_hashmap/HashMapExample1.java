package chap15.sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		// Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// ��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);
		System.out.println("�� Entry ��: " + map.size());
		
		// ��ü ã��
		System.out.println("\tȫ�浿: " + map.get("ȫ�浿"));
		System.out.println();
		
		// ��ü�� �ϴϾ� ó��
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// ��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry ��: " + map.size());
		
		// ��ü�� �ϴϾ� ó��
		Set<Map.Entry<String, Integer>> entryMap = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entryMap.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
	}
}
