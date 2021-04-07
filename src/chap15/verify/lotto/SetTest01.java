package chap15.verify.lotto;

import java.util.HashSet;
import java.util.Iterator;
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
			
			Iterator<Integer> i = s.iterator();
			System.out.print(j + "È¸Â÷: ");
			while(i.hasNext()) {
				System.out.print(i.next()+"\t");
			}
			System.out.println();
			s.clear();
		}
	}
}
