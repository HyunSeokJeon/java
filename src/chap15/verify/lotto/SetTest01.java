package chap15.verify.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SetTest01 {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		Random r = new Random();
		for(int j=1; j<6; j++) {
			while (true) {
				s.add(r.nextInt(45) + 1);
				if(s.size() == 6) {
					break;
				}
			}
			List<Integer> list = new ArrayList<Integer>(s);
			Collections.sort(list);
			System.out.println(list);
			
			
			s.clear();
		}
	}
}
